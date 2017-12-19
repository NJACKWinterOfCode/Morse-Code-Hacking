package texttospeechconversion;
 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 
/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class AudioPlayerExample1 implements LineListener {
     
    /**
     * this flag indicates whether the playback completes or not.
     */
     
    /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     */
    void play(String audioFilePath) {
        File audioFile = new File(audioFilePath);
 
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            try (Clip audioClip = (Clip) AudioSystem.getLine(info)) {
                audioClip.addLineListener(this);
                
                audioClip.open(audioStream);
                
                audioClip.start();
                
                
                    // wait for the playback completes
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                
            }
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
        }
         
    }
    
    
    
     
    /**
     * Listens to the START and STOP events of the audio line.
     * @param args
     */
    
 
    public static void main(String[] args) {
       
        AudioPlayerExample1 player = new AudioPlayerExample1();
         Scanner sc= new Scanner(System.in);
    System.out.println("Enter text: ");
    String address=sc.next();
    
     char b[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
     String r[]={"/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/A.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/B.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/C.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/D.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/E.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/F.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/G.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/H.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/I.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/J.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/K.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/L.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/M.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/N.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/O.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/P.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/Q.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/R.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/S.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/T.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/U.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/V.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/W.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/X.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/Y.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/Z.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/0.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/1.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/2.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/3.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/4.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/5.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/6.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/7.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/8.wav",
                 "/Users/harsh/NetBeansProjects/TextToSpeechConversion/src/texttospeechconversion/9.wav"};
    for(int k=0;k<address.length();k++)
    {
        char s=address.charAt(k);
        for(int j=0;j<36;j++)
        {
            if(s==b[j])
            { player.play(r[j]);}
        }
    }
        
        
        
        
    }

    @Override
    public void update(LineEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
}