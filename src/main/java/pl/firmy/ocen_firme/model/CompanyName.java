package pl.firmy.ocen_firme.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

    public class CompanyName{

        public static String getCompanyName(/*Company krs*/) {

            String line="";

            try {

                URL url = new URL("https://api-v3.mojepanstwo.pl/dane/krs_podmioty.json?conditions[krs_podmioty.krs]=0000010186");
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                line = reader.readLine();
                reader.close();

            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }


            return line;
        }


    }
