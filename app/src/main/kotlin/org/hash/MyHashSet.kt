package org.hash

/**
 * This class will be submitted to leetcode.
 */
open class MyHashSet() {
    private val bucketSize = 10_000
    private val empty = null

    // Use an array list in order to avoid broken collision chains.
    private val buckets = Array<ArrayList<Int>?>(bucketSize) { empty }

    open fun add(key: Int) {
        val hash = hash(key)
        val bucket = buckets[hash]
        if (bucket == empty) {
            buckets[hash] = ArrayList(listOf(key))
        } else if (!bucket.contains(key)) {
            // Don't add a duplicate key.
            bucket.add(key)
        }
    }

    open fun remove(key: Int) {
        val hash = hash(key)
        buckets[hash]?.remove(key)
    }

    open fun contains(key: Int): Boolean {
        val hash = hash(key)
        return buckets[hash]?.contains(key) ?: false
    }

    protected open fun hash(key: Int): Int {
        return key % (bucketSize - 1)
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
