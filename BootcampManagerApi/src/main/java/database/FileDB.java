package database;

import model.Dev;
import model.Login;

import java.io.*;

/**
 * Classe usada para salvar os dados de um usuário usando arquivos de texto.
 * Por questões de simplificação, o nome do arquivo é igual ao e-mail do usuário.
 */
public class FileDB {
    private static final String FILE_DB_DEV_PATH = "src/main/java/database/";
    private static final String FILE_DB_DEV_EXT = ".dat";

    /**
     * Salva objetos em um arquivo usando um ObjectOutputStream.
     *
     * @param dev Objeto a ser salvo em arquivo.
     * @return Retorna true se o objeto for salvo, false caso contrário.
     */
    public boolean saveDevFileDB(Dev dev) {

        final File file = new File(FILE_DB_DEV_PATH + dev.getLogin().getEmail() + FILE_DB_DEV_EXT);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(dev);
        } catch (InvalidClassException e) {
            System.out.println("Erro: Classe inválida.");
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
        } catch (NotSerializableException e) {
            System.out.println("Erro: Objeto não serializável.");
            return false;
        } catch (WriteAbortedException e) {
            System.out.println("Erro: Operação de escrita abortada.");
            return false;
        } catch (IOException e) {
            System.out.println("Erro: Arquivo não pode se manipulado.");
            return false;
        }

        return true;
    }

    /**
     * Recupera objetos em um arquivo usando um ObjectOutputStream.
     *
     * @param login Login usado para recuperar o usuário.
     * @return Retorna o usuário pelo login.
     */
    public Dev restoreDevByLogin(Login login) {

        final File file = new File(FILE_DB_DEV_PATH + login.getEmail() + FILE_DB_DEV_EXT);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getAbsolutePath()))) {
            Dev dev;
            while ((dev = (Dev) ois.readObject()) != null) {
                if (dev.getLogin().checkLogin(login)) {
                    return dev;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
        } catch (SecurityException e) {
            System.out.println("Erro: Acesso a leitura negado.");
        } catch (EOFException e) {
            //System.out.println("Erro: Fim do arquivo.");
        } catch (InvalidClassException e) {
            System.out.println("Erro: Classe inválida.");
        } catch (OptionalDataException e) {
            System.out.println("Erro: Dados primitivos encontrados.");
        } catch (NullPointerException e) {
            System.out.println("Erro: Conteúdo de ObjectInputStream nulo.");
        } catch (StreamCorruptedException e) {
            System.out.println("Erro: Cabeçalho de stream incorreto.");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Classe não encontrada.");
        } catch (IOException e) {
            System.out.println("Erro: Arquivo não pode se manipulado.");
        }

        return null;
    }
}
