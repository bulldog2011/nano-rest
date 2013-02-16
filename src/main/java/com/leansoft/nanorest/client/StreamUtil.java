package com.leansoft.nanorest.client;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtil {

    public static void silentClose(final Closeable stream) {
        try {
    		stream.close();
        } catch (final IOException e) {
        }
    }

    public static String convertStreamToString(final InputStream is) throws IOException {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        final StringBuilder sb = new StringBuilder();

        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
}
