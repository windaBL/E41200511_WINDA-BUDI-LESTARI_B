/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasno1;

/**
 *
 * @author acer
 */
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Televisi tv = new Televisi("TV tempoe doeloe, 14 inches", 10);
     String[] semuaChannel = {"RCTI", "SCTV","INDOSIAR","LA TV","METRO TV","TRANS TV","TPI","TV 7","TVRI","TV G","ANTV"};
     String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV","MTRO TV","TRANS TV","TPI","TV 7"};
     
     System.out.println("Televisi yang baru Winda beli : " + tv.getDeskripsi());
     tv.getChannels();
     tv.setChannels(semuaChannel);
     tv.setChannels(channelFavorit);
     tv.setChannelAktif(3);
     tv.setVolume(10);
     tv.setChannelAktif(1);
     }
}
