import java.io.File;
import java.io.FileInputStream;
 
public class ContentToByteArrayExample
{
   public static void main(String[] args)
   {
       
	   File file = new File("C:\\Users\\anatesan\\Downloads\\999410051503240015632.pdf");
       
      readContentIntoByteArray(file);
   }
 
   private static byte[] readContentIntoByteArray(File file)
   {
      FileInputStream fileInputStream = null;
      byte[] bFile = new byte[(int) file.length()];
      try
      {
         //convert file into array of bytes
        // fileInputStream = new FileInputStream(file);
        // fileInputStream.read(bFile);
        // fileInputStream.close();
         for (int i = 0; i < bFile.length; i++)
         {
            System.out.print((char) bFile[i]);
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return bFile;
   }
}