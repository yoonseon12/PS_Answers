import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val N = st.nextToken().toInt()
        val S = st.nextToken().toInt()
        val arr = br.readLine().split(" ")
            .map { it.toInt() }
            .toTypedArray();

        val answer = partialSum(N, S, arr)
        println(answer)
    }
}

private fun partialSum(N: Int, S: Int, arr: Array<Int>): Int {
    var minLength = Int.MAX_VALUE
    var length = 1
    var sum = 0
    var lt = 0
    var rt = 0
    while (rt < N) {
        sum += arr[rt]

        while (sum >= S) {
            minLength = min(minLength, length)
            sum -= arr[lt]
            lt++
            length--
        }

        rt++
        length++
    }

    return if (minLength == Int.MAX_VALUE) 0 else minLength
}