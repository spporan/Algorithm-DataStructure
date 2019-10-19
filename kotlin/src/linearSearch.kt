fun main(args:Array<String>){
    print("Enter your Array size:")
    var n= readLine()!!.toInt()

    var array=Array(n){0}
    for(i in 0 until n)
        array[i]= readLine()!!.toInt()

    print("Which number you want search? :")
    var key= readLine()!!.toInt()
    if(linearSearch(array,key)==1)
        print("Found $key")
    else
        print("Not found")
}
/*
2,4,5,7,8
key=5
 */



fun linearSearch(arr:Array<Int>,key:Int):Int{
    var n=arr.size
    var found=-1
    for(i in 0 until n)
        found = if (arr[i]==key)
            1
        else
            -1



   return found
}