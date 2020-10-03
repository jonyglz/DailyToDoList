//Daily Schedule
//Author: Jonathan Gonzalez
//Title: Basic List.kt

fun main() {
    var option:Int = -1
    val schedule = mutableListOf<String>()
    val time = mutableListOf<Int>()

    while(option != 0) {

        println()
        println("Welcome to your daily schedule: ")
        println("0. Quit.")
        println("1. Add task")
        println("2. View Tasks")
        println("3. Remove Tasks")
        println()

        option = Integer.valueOf(readLine())

        if (option == 1) {
            println()
            println("Write your task: ")
            val new_task: String? = readLine()
            schedule.add(new_task!!)
            println("Time: ")
            val new_time = Integer.valueOf(readLine())
            time.add(new_time!!)
        }

        if (option == 2) {
            for(index in 0..schedule.size-1){
                println("${index+1}. ${schedule[index]} - ${time[index]}")
            }
            //val listIterator = schedule.listIterator()
            //while (listIterator.hasNext()) {
            //  print("${listIterator.previousIndex()}")
        }

        if (option == 3) {
            print(schedule)
            println()
            print("Which element do you want to remove?")
            val remove_item = Integer.valueOf(readLine())
            schedule.removeAt(remove_item)
            time.removeAt(remove_item)
            print(schedule)
        }

    }
}