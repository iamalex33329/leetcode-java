package medium;

import java.util.HashMap;
import java.util.Map;

public class Problem535 {

    public class Codec {

        private Map<String, String> map;
        private static final String BASE_URL = "http://tinyurl.com/";

        public Codec() {
            map = new HashMap<>();
        }

        // Helper method to generate a hash for a given URL.
        private String generateHash(String url) {
            return Integer.toHexString(url.hashCode());
        }

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String hash = generateHash(longUrl);
            map.put(hash, longUrl);
            return BASE_URL + hash;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            String hash = shortUrl.replace(BASE_URL, "");
            return map.get(hash);
        }
    }
}
