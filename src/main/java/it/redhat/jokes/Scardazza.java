package it.redhat.jokes;

import java.util.Random;

public class Scardazza {

    public static void main( String[] args ) {

        Scardazza pigi = new Scardazza();
        System.out.println(pigi.says());

    }

    public String says() {
         return sentences[new Random().nextInt(sentences.length)];
    }

    private String[] sentences = {"Bocelli e' mio zio...", "Repetita Juventus", "Train the trainer.... ITALO!", "Stocazzo!", "STOCAZZO!!!", "C'e' qui uno che ti vuole salutare...", "Stocazzo!!!", "Ah, oggi fai mezza giornata?", "Ma ti vesti sempre cosi'?", "STOCAZZO!", "Qua comando io..." };

}
