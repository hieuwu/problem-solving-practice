package leetcode.arrays

fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
    if (list1.size > list2.size) return findRestaurant(list2, list1);
    var indexSum = Integer.MAX_VALUE
    var result =  arrayListOf<String>()
    var map = HashMap<String, Int>()

    for(i in list1.indices) {
        map[list1[i]] = i
    }

    for(i in list2.indices) {
        if(map.containsKey(list2[i])) {

            var index = i + map[list2[i]]!!
            if (index < indexSum){
                indexSum = index
                result.clear()
                result.add(list2[i])
            } else if(index == indexSum)
                result.add(list2[i])
        }
    }

    return result.toTypedArray()

}