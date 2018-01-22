/**
 * Implementation of a Deque in Kotlin.
 *
 * Remember that a Deque follows the FIFO data structure. i.e. First in, first out.
 *
 * A Deque can be implemented with a Linked List.
 *
 * */

class Deque<T> constructor () {
    // Header and Trailer nodes that are initialized to null
    private var header: Element<T?>
    private var trailer: Element<T?>
    private var size: Int = 0

    init
    {
        header = Element(null, null, null)
        trailer = Element(null, header, null)

        // Initialize with the header element set with the next element attached to the trailer
        header.setNextElement(trailer)
    }

    // Return the size of the Deque
    fun getSize(): Int
    {
        return size
    }
    // Return if Deque is empty or not
    fun isEmpty(): Boolean
    {
        return size == 0
    }

    private fun addBetween(value: T, prev: Element<T?>, next: Element<T?>)
    {
        var newest: Deque.Element<T?> = Element(value, prev, next)

        prev.setNextElement(newest)
        next.setPrevElement(newest)

        size ++
    }
    // Push onto the deque an element, i.e. create an element at the tail end
    fun push(value: T): Unit
    {
        // Create the newest element to attach to the list
        addBetween(value, trailer.getPrevElement()!!, trailer)

    }

    // Pop an element off the deque, i.e. remove the last item
    fun pop(): T? {
        // Value we are removing
        var value: T = trailer.getPrevElement()?.getElement()!!

        // Removing the last item means removing the one previous from the trailer
        var newLastElement: Deque.Element<T?>? = trailer.getPrevElement()?.getPrevElement()

        trailer.setPrevElement(newLastElement!!)

        size --

        return value
    }

    // Insert a value at the front of the deque
    fun unshift(value: T) {
        // New element after the header
        addBetween(value, header, header.getNextElement()!!)
    }

    // Remove a value at the front of the deque
    fun shift(): T? {
        // Element we are removing
        val value: T = header.getNextElement()?.getElement()!!

        // Set the header next element reference to the element after the header getNextElement i.e. two over.
        header.setNextElement(header.getNextElement()?.getNextElement()!!)

        size --

        return value
    }

    // Peek at first element
    fun peekFirst(): T?
    {
        return header.getNextElement()?.getElement()
    }
    // Peek at the last element
    fun peekLast(): T?
    {
        return trailer.getPrevElement()?.getElement()
    }


    /**
     * This is the "Node" Class called "Element" here.
     *
     * Constructor defines the following parameters:
     *
     * @param value refers to the current value we want in the Node
     * @param prev pointer that refers to the previous Node
     * @param next pointer that refers to the next Node
     * */
    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
    {

        /*
        * Three methods that getElement, getNextElement or getPrevElement
        * */
        // Get the current element value
        fun getElement(): T
        {
            return value
        }
        // Return the next Node in the Deque
        fun getNextElement(): Element<T>?
        {
            return next
        }
        // Return the previous Node in the Deque
        fun getPrevElement(): Element<T>?
        {
            return prev
        }

        /*
        * Mutator methods
        * */
        fun setNextElement(ele: Element<T>): Unit
        {
            next = ele
        }
        fun setPrevElement(ele: Element<T>): Unit
        {
            prev = ele
        }
    }
}

fun main(args: Array<String>)
{
    println("Hi. I'm creating the deque now ... ")

    // Creation of a new Deque instance of type String
    var d: Deque<String> = Deque()

    println("Current size of the Deque : " + d.getSize())

    println("Adding elements of Type String to the Deque ... ")
    d.push("First Item")
    d.push("Second Item")
    d.push("Third Item")
    println("Changed the size of the Deque, should be three : ...Checking...." + d.getSize())

    println(d.peekFirst()) // Should return "First Item"
    println(d.peekLast()) // Should return "Third Item"

    d.unshift("New First Element")
    println(d.peekFirst())

    // Remove first element, should remove "New First Element"
    println(d.shift())

    // Remove last element, should remove "Third Item"
    println(d.pop())

    // Should now remove "Second Item"
    println(d.pop())

    // Size should now be 1 ...
    println(d.getSize())



}