package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        val listA = a.toUpperCase().toList()
        val listB = b.toList()
        return if (listA.intersect(listB).toList() == listB) "YES" else "NO"
    }
}
