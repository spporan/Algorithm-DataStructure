import java.util.*

fun  main(args:Array<String>){
    print("Enter no. of elements :")
    var n = readLine()!!.toInt()
    var arr = Array(n) { 0 }
    for (i in 0 until n)
        arr[i]=readLine()!!.toInt()

    var array=selectionSort(arr)

    for (i in 0 until n)
        print("${array[i]}")



}
//5,3,6,2,9
fun  selectionSort(arr:Array<Int>):Array<Int>{
    var temp:Int
    var n=arr.size
    var minIndex:Int;
    for (i in 0 until n) {
        minIndex=i
        for (j in i + 1 until n)
            if (arr[minIndex] > arr[j])
                minIndex = j
        if (minIndex != i){
            temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }

    }
    return arr

    /*
    Time Complexity O(n^2)
    Space Complexity O(1)
     */

}