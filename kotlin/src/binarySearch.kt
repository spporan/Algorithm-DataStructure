
fun binarySearch(arr:Array<Int>,key:Int):Int?
{

    var l=0
    var h=arr.size-1
    while (l<=h){
        var mid:Int=(l+h)/2

        when {
            key==arr[mid] -> return 1

            key>arr[mid] -> l=mid+1

            else -> h=mid-1
        }

    }


    return null
}
//must have a sorted array
fun main(args:Array<String>){
    print("Enter your Array size:")
    var n= readLine()!!.toInt()

    var array=Array(n){0}
    for(i in 0 until n)
        array[i]= readLine()!!.toInt()

    print("Which number you want search? :")
    var key= readLine()!!.toInt()
    if(binarySearch(array,key)!=null)
        print("Found $key")
    else
        print("Not found")

    /*
    * Must have sorted array  for binary search
    * Time Complexity O(log2^n)
    * space complexity O(1)
    * */
}