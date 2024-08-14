import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    BufferedReader(InputStreamReader(System.`in`)).use { br ->
        val N: Int = br.readLine().toInt()
        val arr: Array<Int> = br.readLine().split(" ")
            .map { it.toInt() }
            .toTypedArray()

        arr.sort();

        val answer = toPointer(N, arr)
        println(answer)
    }
}

private fun toPointer(N: Int, arr: Array<Int>): String {
    var lt = 0
    var rt = arr.size-1

    var minSum = Int.MAX_VALUE
    var answerArr: Array<Int> = arrayOf(arr[lt], arr[rt])

    while (lt < rt) {

        val sum = arr[lt] + arr[rt]

        if (abs(sum) < abs(minSum)) {
            minSum = sum
            answerArr = arrayOf(arr[lt], arr[rt])
        }

        if (sum < 0) {
            lt++
        } else {
            rt--
        }

    }

    return answerArr.joinToString(" ").toString()
}