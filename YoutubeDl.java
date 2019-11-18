import java.io.*;

public class YoutubeDl{
   public static void main(String[] args) 
   {
            try
            { 
            Process process = Runtime.getRuntime().exec("youtube-dl --max-downloads=1 ytsearch:\"cleo dom\" --extract-audio --audio-format mp3");
           
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
               while ((line=reader.readLine())!=null)
               {
                System.out.println(line);   
                }
             }       
                catch(Exception e)
             { 
                 System.out.println(e); 
             }
               
    }
}
