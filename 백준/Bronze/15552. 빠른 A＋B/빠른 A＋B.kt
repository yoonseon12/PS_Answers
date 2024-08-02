import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main () {
    BufferedReader(InputStreamReader(System.`in`)).use { br ->
        BufferedWriter(OutputStreamWriter(System.out)).use { bw ->
            var N = br.readLine().toInt()

            for (int in 0 until N) {
                var st = StringTokenizer(br.readLine())
                var a = st.nextToken().toInt()
                var b = st.nextToken().toInt()

                bw.write((a + b).toString())
                bw.newLine()
            }
            bw.flush()
        }
    }
}