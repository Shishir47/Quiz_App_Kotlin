package com.shishir.quizapp.utils

import com.shishir.quizapp.model.Questions

object Constants {
    const val USERNAME="username"
    fun getQuestions(): MutableList<Questions>{
        val questions= mutableListOf<Questions>()
        val quest1= Questions(
            1,
            "What is an algorithm?",
            "A programming language.",
            "A set of rules or steps to solve a problem.",
            "A type of data structure.",
            "A software application.",
            1
        )
        questions.add(quest1)
        val quest2= Questions(
            2,
            "What is the purpose of a loop in programming?",
            "To store data.",
            "To perform repetitive tasks.",
            "To call a function.",
            "To define a class.",
            2
        )
        questions.add(quest2)
        val quest3= Questions(
            3,
            "What does 'DRY' stand for in programming?",
            "Don't Repeat Yourself.",
            "Do Repeat Yourself.",
            "Don't Reuse Your code.",
            "Do Reuse Your code.",
            3
        )
        questions.add(quest3)
        val quest4= Questions(
            4,
            "What is a variable in programming?",
            "A fixed value that cannot change.",
            "A named storage location in memory that can hold different values.",
            "A function that returns a value.",
            "A type of error.",
            4
        )
        questions.add(quest4)
        val quest5= Questions(
            5,
            "What is a data structure?",
            "A way of organizing and storing data.",
            "A software tool for debugging.",
            "A network protocol.",
            "A type of algorithm.",
            3
            )
        questions.add(quest5)
        val quest6= Questions(
            6,
            "What is meant by 'inheritance' in object-oriented programming?",
            "A feature that prevents data from being modified.",
            "A way to extend a class to create a new class.",
            "A method for garbage collection.",
            "A process of executing multiple threads.",
            4
        )
        questions.add(quest6)
        val quest7= Questions(
            7,
            "What is a 'syntax error'?",
            "An error due to incorrect logic in the code.",
            "An error caused by violating the rules of the programming language.",
            "An error that occurs during the runtime of a program.",
            "An error related to memory allocation.",
            2
        )
        questions.add(quest7)
        val quest8= Questions(
            8,
            "What is a 'compiler'?",
            "A tool that executes code line by line.",
            "A program that converts high-level code into machine code.",
            "A data structure for organizing code.",
            "A software tool for debugging.",
            2
        )
        questions.add(quest8)
        val quest9= Questions(
            9,
            "What is the primary purpose of version control systems?",
            "To manage software licensing.",
            "To track and manage changes to code.",
            "To compile code.",
            "To debug code.",
            2
        )
        questions.add(quest9)
        val quest10= Questions(
            10,
            "What does 'API' stand for and what is its purpose?",
            "Application Program Interface; to provide an interface for network communication.",
            "Application Process Interchange; to handle process scheduling.",
            "Application Programming Interface; to allow different software components to communicate.",
            "Application Programming Interchange; to exchange data between programs.",
            3
        )
        questions.add(quest10)
        val quest11= Questions(
            11,
            "What is the time complexity of binary search in a sorted array?",
            "O(n)",
            "O(n^2)",
            "O(log n)",
            "O(1)",
            3
        )
        questions.add(quest11)
        val quest12= Questions(
            12,
            "Which data structure uses LIFO (Last In First Out)?",
            "Queue",
            "Stack",
            "Array",
            "Linked List",
            2
        )
        questions.add(quest12)
        val quest13= Questions(
            13,
            "What is a linked list?",
            "A collection of elements stored at contiguous memory locations.",
            "A collection of nodes where each node contains data and a reference to the next node.",
            "A tree structure with parent and child nodes.",
            "A set of key-value pairs.",
            2
        )
        questions.add(quest13)
        val quest14= Questions(
            14,
            "What is a hash table used for?",
            "Storing data in a hierarchical manner.",
            "Storing data in a way that allows for fast retrieval using keys.",
            "Storing data in a fixed-size buffer.",
            "Storing data in a sequence.",
            2
        )
        questions.add(quest14)
        val quest15= Questions(
            15,
            "What is the main advantage of using a binary search tree?",
            "Easy to implement.",
            "Easy to implement.",
            "Uses less memory.",
            "Supports sequential data access.",
            1
        )
        questions.add(quest15)
        val quest16= Questions(
            16,
            "What is a queue, and what are its main operations?",
            "A collection of elements with random access.",
            "A collection of elements with FIFO (First In First Out) access; main operations are enqueue and dequeue.",
            "A tree structure with depth-first traversal.",
            "A collection of elements with LIFO (Last In First Out) access.",
            2
        )
        questions.add(quest16)
        val quest17= Questions(
            17,
            "What is the purpose of sorting algorithms?",
            "To remove duplicates from a list.",
            "To arrange elements in a specific order.",
            "To merge multiple lists into one.",
            "To search for an element in a list.",
            1
        )
        questions.add(quest17)
        val quest18= Questions(
            18,
            "What is the difference between a depth-first search (DFS) and a breadth-first search (BFS)?",
            "DFS explores nodes level by level, BFS explores nodes depth by depth.",
            "DFS uses a stack, BFS uses a queue.",
            "DFS is used for trees, BFS is used for graphs.",
            "DFS finds the shortest path, BFS does not.",
            1
        )
        questions.add(quest18)
        return questions
    }
}