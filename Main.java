import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader(System.in);
        StringBuilder out = new StringBuilder();

        // TODO solve the problem....

        System.out.println(out);
        sc.close();
    }

    static class FastReader {
        private final BufferedReader br;
        private StringTokenizer tokenizer;

        FastReader(InputStream in) {
            this.br = new BufferedReader(new InputStreamReader(in));
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        short nextShort() {
            return Short.parseShort(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String next() {
            String content = null;
            try {
                if (this.tokenizer == null || !this.tokenizer.hasMoreElements())
                    this.tokenizer = new StringTokenizer(br.readLine());
                content = this.tokenizer.nextToken();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content;
        }

        void close() {
            try {
                this.br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
