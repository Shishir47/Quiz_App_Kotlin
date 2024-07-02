package com.shishir.quizapp.utils

import com.shishir.quizapp.model.Questions
import kotlin.random.Random

object Constants {
    const val USERNAME = "username"
    const val SCORE = "score"
    const val TOTALQUEST = "totalquest"
    const val CATEGORYSELCTOR = "categoryselector"
    fun getbasicQuestions(): MutableList<Questions> {
        val basicProgramming = mutableListOf<Questions>()

        val quest1 = Questions(
            1,
            "What is an algorithm?",
            "A programming language.",
            "A set of rules or steps to solve a problem.",
            "A type of data structure.",
            "A software application.",
            2
        )
        basicProgramming.add(quest1)

        val quest2 = Questions(
            2,
            "What is a variable?",
            "A constant value.",
            "A named storage location that can hold data.",
            "A data type.",
            "A loop construct.",
            2
        )
        basicProgramming.add(quest2)

        val quest3 = Questions(
            3,
            "What is a loop?",
            "A conditional statement.",
            "A block of code that runs once.",
            "A statement that ends the program.",
            "A block of code that repeats until a condition is false.",
            4
        )
        basicProgramming.add(quest3)

        val quest4 = Questions(
            4,
            "What is conditional statement?",
            "A statement that ends the program.",
            "A block of code that runs once.",
            "A block of code that repeats until a condition is false.",
            "A statement that performs different actions based on whether a condition is true or false.",
            4
        )
        basicProgramming.add(quest4)

        val quest5 = Questions(
            5,
            "What is a function?",
            "A block of code that runs once.",
            "A block of code that repeats until a condition is false.",
            "A named group of statements that perform a specific task.",
            "A loop construct.",
            3
        )
        basicProgramming.add(quest5)

        val quest6 = Questions(
            6,
            "What is debugging?",
            "Writing code without testing it.",
            "Identifying and fixing errors in code.",
            "Creating new algorithms.",
            "Optimizing code for performance.",
            2
        )
        basicProgramming.add(quest6)

        val quest7 = Questions(
            7,
            "What is syntax error?",
            "An error that occurs during runtime.",
            "An error that occurs when the code violates the rules of the programming language.",
            "An error that occurs due to hardware failure.",
            "An error that occurs due to logical mistakes in code.",
            2
        )
        basicProgramming.add(quest7)

        val quest8 = Questions(
            8,
            "What is a compiler?",
            "A tool for debugging code.",
            "A tool for translating high-level language code into machine code.",
            "A tool for managing database queries.",
            "A tool for optimizing code.",
            2
        )
        basicProgramming.add(quest8)

        val quest9 = Questions(
            9,
            "What is a data type?",
            "A type of algorithm.",
            "A type of function.",
            "A classification of data that specifies possible values and operations.",
            "A type of loop.",
            3
        )
        basicProgramming.add(quest9)

        val quest10 = Questions(
            10,
            "What is an array?",
            "A single variable.",
            "A collection of variables of the same type.",
            "A type of loop.",
            "A type of conditional statement.",
            2
        )
        basicProgramming.add(quest10)

        val quest11 = Questions(
            11,
            "What is object-oriented programming (OOP)?",
            "A programming paradigm based on objects.",
            "A type of data structure.",
            "A type of loop.",
            "A technique for debugging code.",
            1
        )
        basicProgramming.add(quest11)

        val quest12 = Questions(
            12,
            "What is procedural programming?",
            "A programming paradigm based on objects.",
            "A programming paradigm based on procedures or functions.",
            "A type of data structure.",
            "A technique for debugging code.",
            2
        )
        basicProgramming.add(quest12)

        val quest13 = Questions(
            13,
            "What is encapsulation?",
            "A technique for debugging code.",
            "A concept that binds together the data and functions that manipulate the data.",
            "A type of loop.",
            "A method for writing efficient algorithms.",
            2
        )
        basicProgramming.add(quest13)

        val quest14 = Questions(
            14,
            "What is inheritance in OOP?",
            "A technique for debugging code.",
            "A concept that allows a class to inherit properties and methods from another class.",
            "A type of loop.",
            "A method for writing efficient algorithms.",
            2
        )
        basicProgramming.add(quest14)

        val quest15 = Questions(
            15,
            "What is polymorphism in OOP?",
            "A technique for debugging code.",
            "A concept that allows objects to be treated as instances of their parent class.",
            "A type of loop.",
            "A concept that allows objects to be treated as instances of their actual class and their parent class.",
            4
        )
        basicProgramming.add(quest15)

        val quest16 = Questions(
            16,
            "What is a constructor?",
            "A method for debugging code.",
            "A special method for initializing objects.",
            "A type of loop.",
            "A concept for organizing code.",
            2
        )
        basicProgramming.add(quest16)

        val quest17 = Questions(
            17,
            "What is a destructor?",
            "A method for debugging code.",
            "A special method for destroying objects.",
            "A concept for organizing code.",
            "A type of loop.",
            2
        )
        basicProgramming.add(quest17)

        val quest18 = Questions(
            18,
            "What is a namespace?",
            "A concept for organizing code.",
            "A method for debugging code.",
            "A special method for initializing objects.",
            "A type of loop.",
            1
        )
        basicProgramming.add(quest18)

        val quest19 = Questions(
            19,
            "What is recursion?",
            "A method for debugging code.",
            "A concept where a function calls itself directly or indirectly.",
            "A special method for initializing objects.",
            "A type of loop.",
            2
        )
        basicProgramming.add(quest19)

        val quest20 = Questions(
            20,
            "What is a pointer?",
            "A variable that stores the address of another variable.",
            "A method for debugging code.",
            "A concept for organizing code.",
            "A type of loop.",
            1
        )
        basicProgramming.add(quest20)

        val quest21 = Questions(
            21,
            "What is memory allocation?",
            "A concept where a function calls itself directly or indirectly.",
            "A process of reserving memory space during program execution.",
            "A method for debugging code.",
            "A type of loop.",
            2
        )
        basicProgramming.add(quest21)

        val quest22 = Questions(
            22,
            "What is dynamic memory allocation?",
            "A method for debugging code.",
            "A process of allocating memory at runtime.",
            "A concept where a function calls itself directly or indirectly.",
            "A type of loop.",
            2
        )
        basicProgramming.add(quest22)

        return basicProgramming
    }

    fun getdsQuestions(): MutableList<Questions> {
        val dataStructures = mutableListOf<Questions>()

        val quest1 = Questions(
            1,
            "What is a linked list?",
            "A linear data structure where elements are stored in contiguous memory locations.",
            "A data structure where elements are stored in non-contiguous memory locations.",
            "A data structure that stores elements in a hierarchical manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest1)

        val quest2 = Questions(
            2,
            "What is a stack?",
            "A data structure where elements are stored based on their priority.",
            "A linear data structure that follows Last In First Out (LIFO) principle.",
            "A data structure that stores elements in a hierarchical manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest2)

        val quest3 = Questions(
            3,
            "What is a queue?",
            "A data structure where elements are stored based on their priority.",
            "A linear data structure that follows First In First Out (FIFO) principle.",
            "A data structure that stores elements in a hierarchical manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest3)

        val quest4 = Questions(
            4,
            "What is a heap?",
            "A data structure that stores elements in a hierarchical manner.",
            "A linear data structure that follows Last In First Out (LIFO) principle.",
            "A linear data structure that follows First In First Out (FIFO) principle.",
            "A data structure that is not used in programming.",
            1
        )
        dataStructures.add(quest4)

        val quest5 = Questions(
            5,
            "What is a hash table?",
            "A data structure where elements are stored in contiguous memory locations.",
            "A data structure that stores elements in a hierarchical manner.",
            "A data structure that provides fast access to data based on keys.",
            "A data structure that is not used in programming.",
            3
        )
        dataStructures.add(quest5)

        val quest6 = Questions(
            6,
            "What is a binary tree?",
            "A data structure where elements are stored in non-contiguous memory locations.",
            "A data structure where each node has at most one child.",
            "A data structure that stores elements in a hierarchical manner with exactly two children for each node.",
            "A data structure that is not used in programming.",
            3
        )
        dataStructures.add(quest6)

        val quest7 = Questions(
            7,
            "What is a binary search tree?",
            "A data structure that stores elements in a hierarchical manner with exactly two children for each node.",
            "A data structure where elements are stored based on their priority.",
            "A linear data structure that follows First In First Out (FIFO) principle.",
            "A data structure that is not used in programming.",
            1
        )
        dataStructures.add(quest7)

        val quest8 = Questions(
            8,
            "What is a graph?",
            "A data structure where elements are stored in non-contiguous memory locations.",
            "A data structure that stores elements in a hierarchical manner.",
            "A data structure that consists of a set of nodes (vertices) and a set of edges connecting pairs of nodes.",
            "A data structure that is not used in programming.",
            3
        )
        dataStructures.add(quest8)

        val quest9 = Questions(
            9,
            "What is a trie?",
            "A data structure that stores elements in a hierarchical manner.",
            "A data structure where elements are stored based on their priority.",
            "A tree-like data structure that stores a dynamic set of strings.",
            "A data structure that is not used in programming.",
            3
        )
        dataStructures.add(quest9)

        val quest10 = Questions(
            10,
            "What is a priority queue?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A data structure where elements are stored in non-contiguous memory locations.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            1
        )
        dataStructures.add(quest10)

        val quest11 = Questions(
            11,
            "What is a segment tree?",
            "A data structure where elements are stored based on their priority.",
            "A tree-like data structure used for storing intervals or segments.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest11)

        val quest12 = Questions(
            12,
            "What is an AVL tree?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A self-balancing binary search tree where the difference between heights of left and right subtrees cannot be more than one.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest12)

        val quest13 = Questions(
            13,
            "What is a B-tree?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A self-balancing tree data structure that maintains sorted data and allows searches, sequential access, insertions, and deletions in logarithmic time.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest13)

        val quest14 = Questions(
            14,
            "What is a red-black tree?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A type of tree with nodes colored either red or black used in computer science.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest14)

        val quest15 = Questions(
            15,
            "What is a trie?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A tree-like data structure that stores a dynamic set of strings.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest15)

        val quest16 = Questions(
            16,
            "What is a radix tree?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A type of tree used to represent a mapping from keys to values where the keys are usually strings.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest16)

        val quest17 = Questions(
            17,
            "What is a segment tree?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A tree-like data structure used for storing intervals or segments.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest17)

        val quest18 = Questions(
            18,
            "What is a skip list?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A data structure that allows fast search, insertion, and deletion operations.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest18)

        val quest19 = Questions(
            19,
            "What is a bloom filter?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A probabilistic data structure used to test whether an element is a member of a set.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest19)

        val quest20 = Questions(
            20,
            "What is a deque?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A double-ended queue that allows insertion and deletion at both ends.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest20)

        val quest21 = Questions(
            21,
            "What is a bit array?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A data structure that stores bits compactly.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest21)

        val quest22 = Questions(
            22,
            "What is a quadtree?",
            "A data structure that stores elements in a hierarchical manner based on their priority.",
            "A tree data structure used to represent two-dimensional space.",
            "A data structure that stores elements in a linear manner.",
            "A data structure that is not used in programming.",
            2
        )
        dataStructures.add(quest22)

        return dataStructures
    }

    fun getalgorithmQuestions(): MutableList<Questions> {
        val algorithms = mutableListOf<Questions>()

        val quest1 = Questions(
            1,
            "What is a sorting algorithm?",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that searches for an element in an array.",
            "An algorithm that combines two sorted arrays into one.",
            "An algorithm that explores all vertices of a graph level by level.",
            1
        )
        algorithms.add(quest1)

        val quest2 = Questions(
            2,
            "What is a searching algorithm?",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that searches for an element in an array.",
            "An algorithm that combines two sorted arrays into one.",
            "An algorithm that explores all vertices of a graph level by level.",
            2
        )
        algorithms.add(quest2)

        val quest3 = Questions(
            3,
            "What is a greedy algorithm?",
            "An algorithm that always makes the locally optimal choice.",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that searches for an element in an array.",
            "An algorithm that explores all vertices of a graph level by level.",
            1
        )
        algorithms.add(quest3)

        val quest4 = Questions(
            4,
            "What is a dynamic programming algorithm?",
            "An algorithm that always makes the locally optimal choice.",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that uses past solutions to solve larger problems.",
            "An algorithm that explores all vertices of a graph level by level.",
            3
        )
        algorithms.add(quest4)

        val quest5 = Questions(
            5,
            "What is a divide and conquer algorithm?",
            "An algorithm that uses past solutions to solve larger problems.",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that explores all vertices of a graph level by level.",
            "An algorithm that divides the problem into smaller sub-problems and solves each sub-problem recursively.",
            4
        )
        algorithms.add(quest5)

        val quest6 = Questions(
            6,
            "What is a backtracking algorithm?",
            "An algorithm that always makes the locally optimal choice.",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that tries to build a solution incrementally and abandons partial solutions that fail to satisfy the constraints.",
            "An algorithm that explores all vertices of a graph level by level.",
            3
        )
        algorithms.add(quest6)

        val quest7 = Questions(
            7,
            "What is a breadth-first search (BFS)?",
            "An algorithm that explores all vertices of a graph level by level.",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that searches for an element in an array.",
            "An algorithm that combines two sorted arrays into one.",
            1
        )
        algorithms.add(quest7)

        val quest8 = Questions(
            8,
            "What is a depth-first search (DFS)?",
            "An algorithm that rearranges elements of an array in a specific order.",
            "An algorithm that explores all vertices of a graph level by level.",
            "An algorithm that searches for an element in an array.",
            "An algorithm that combines two sorted arrays into one.",
            2
        )
        algorithms.add(quest8)

        val quest9 = Questions(
            9,
            "What is an algorithm complexity?",
            "The number of lines of code in an algorithm.",
            "A measure of the efficiency of an algorithm.",
            "A measure of how many different steps an algorithm has.",
            "The time it takes for an algorithm to execute.",
            2
        )
        algorithms.add(quest9)

        val quest10 = Questions(
            10,
            "What is Big O notation?",
            "A measure of the efficiency of an algorithm.",
            "A measure of how many different steps an algorithm has.",
            "The time it takes for an algorithm to execute.",
            "The number of lines of code in an algorithm.",
            1
        )
        algorithms.add(quest10)

        val quest11 = Questions(
            11,
            "What is Floyd-Warshall algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest11)

        val quest12 = Questions(
            12,
            "What is Dijkstra's algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest12)

        val quest13 = Questions(
            13,
            "What is Kruskal's algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            2
        )
        algorithms.add(quest13)

        val quest14 = Questions(
            14,
            "What is Prim's algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            2
        )
        algorithms.add(quest14)

        val quest15 = Questions(
            15,
            "What is Tarjan's algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            3
        )
        algorithms.add(quest15)

        val quest16 = Questions(
            16,
            "What is Bellman-Ford algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest16)

        val quest17 = Questions(
            17,
            "What is Ford-Fulkerson algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding the maximum flow in a flow network.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            2
        )
        algorithms.add(quest17)

        val quest18 = Questions(
            18,
            "What is Kosaraju's algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding the minimum cut in a flow network.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            3
        )
        algorithms.add(quest18)

        val quest19 = Questions(
            19,
            "What is Floyd-Warshall algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest19)

        val quest20 = Questions(
            20,
            "What is Floyd-Warshall algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest20)

        val quest21 = Questions(
            21,
            "What is Floyd-Warshall algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest21)

        val quest22 = Questions(
            22,
            "What is Floyd-Warshall algorithm?",
            "An algorithm for finding shortest paths in a weighted graph with positive or negative edge weights (but with no negative cycles).",
            "An algorithm for finding minimum spanning tree in a graph.",
            "An algorithm for finding the strongly connected components in a graph.",
            "An algorithm for finding the longest path in a directed acyclic graph (DAG).",
            1
        )
        algorithms.add(quest22)

        return algorithms
    }

    fun getseQuestions(): MutableList<Questions> {
        val softwareEngineering = mutableListOf<Questions>()

        val quest1 = Questions(
            1,
            "What is software development life cycle (SDLC)?",
            "A software development methodology.",
            "A specific phase in software development where the code is written.",
            "A process for planning, creating, testing, and deploying software.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest1)

        val quest2 = Questions(
            2,
            "What is agile methodology?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A specific phase in software development where the code is written.",
            "A process for planning, creating, testing, and deploying software.",
            "A type of software application.",
            1
        )
        softwareEngineering.add(quest2)

        val quest3 = Questions(
            3,
            "What is waterfall model?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A specific phase in software development where the code is written.",
            "A sequential software development process, in which progress is seen as flowing steadily downwards (like a waterfall) through phases such as conception, initiation, analysis, design, construction, testing, deployment, and maintenance.",
            "A type of software application.",
            2
        )
        softwareEngineering.add(quest3)

        val quest4 = Questions(
            4,
            "What is version control?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A system that records changes to a file or set of files over time so that you can recall specific versions later.",
            "A process for planning, creating, testing, and deploying software.",
            "A type of software application.",
            2
        )
        softwareEngineering.add(quest4)

        val quest5 = Questions(
            5,
            "What is continuous integration (CI)?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "A practice where developers merge code changes into a central repository several times a day, allowing teams to detect problems early.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest5)

        val quest6 = Questions(
            6,
            "What is continuous delivery (CD)?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "A practice where code changes are automatically built, tested, and prepared for release to production.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest6)

        val quest7 = Questions(
            7,
            "What is unit testing?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "A level of software testing where individual units or components of a software application are tested.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest7)

        val quest8 = Questions(
            8,
            "What is integration testing?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A level of software testing where individual units or components of a software application are tested.",
            "A level of software testing where multiple units or components of a software application are combined and tested as a group.",
            "A type of software application.",
            2
        )
        softwareEngineering.add(quest8)

        val quest9 = Questions(
            9,
            "What is system testing?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A level of software testing where individual units or components of a software application are tested.",
            "A level of software testing where a complete and integrated software application is tested to evaluate the system's compliance with its specified requirements.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest9)

        val quest10 = Questions(
            10,
            "What is regression testing?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A level of software testing where individual units or components of a software application are tested.",
            "A type of software testing that verifies that a recent program or code change has not adversely affected existing features.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest10)

        val quest11 = Questions(
            11,
            "What is acceptance testing?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A level of software testing where individual units or components of a software application are tested.",
            "A level of software testing where a software application is tested to evaluate its compliance with business requirements and assess whether it is ready for deployment.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest11)

        val quest12 = Questions(
            12,
            "What is a code review?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A level of software testing where individual units or components of a software application are tested.",
            "A systematic examination of code by one or more individuals to find and fix mistakes overlooked in the initial development phase.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest12)

        val quest13 = Questions(
            13,
            "What is pair programming?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "An agile software development technique where two programmers work together at one workstation.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest13)

        val quest14 = Questions(
            14,
            "What is technical debt?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "The accumulated cost of additional rework caused by choosing an easy (limited) solution now instead of using a better approach that would take longer.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest14)

        val quest15 = Questions(
            15,
            "What is a software requirement specification (SRS)?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "A complete description of the behavior of a system to be developed, including functional and non-functional requirements.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest15)

        val quest16 = Questions(
            16,
            "What is a software design pattern?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "A general repeatable solution to a commonly occurring problem in software design.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest16)

        val quest17 = Questions(
            17,
            "What is refactoring in software engineering?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "The process of restructuring existing computer code without changing its external behavior to improve its internal structure.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest17)

        val quest18 = Questions(
            18,
            "What is software architecture?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "The structure of a software system, including the relationships among components, the behavior of the system, and the constraints on these components.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest18)

        val quest19 = Questions(
            19,
            "What is UML (Unified Modeling Language)?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A standardized modeling language used to specify, visualize, construct, and document software-intensive systems.",
            "A type of software application.",
            "A type of software architecture",
            2
        )
        softwareEngineering.add(quest19)

        val quest20 = Questions(
            20,
            "What is continuous deployment?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "A practice where every code change goes through the entire pipeline and is automatically put into production, resulting in many production deployments every day.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest20)

        val quest21 = Questions(
            21,
            "What is a software bug?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A process for planning, creating, testing, and deploying software.",
            "An error, flaw, failure, or fault in a computer program or system that causes it to produce an incorrect or unexpected result or to behave in unintended ways.",
            "A type of software application.",
            3
        )
        softwareEngineering.add(quest21)

        val quest22 = Questions(
            22,
            "What is a software framework?",
            "A software development methodology focused on iterative development, where requirements and solutions evolve through collaboration between self-organizing cross-functional teams.",
            "A structured set of libraries, tools, and best practices to help developers build and maintain complex software applications.",
            "A process for planning, creating, testing, and deploying software.",
            "A type of software application.",
            2
        )
        softwareEngineering.add(quest22)

        return softwareEngineering
    }

    fun getdbQuestions(): MutableList<Questions> {
        val databases = mutableListOf<Questions>()

        val quest1 = Questions(
            1,
            "What is a database?",
            "A collection of data organized in rows and columns.",
            "A type of programming language.",
            "A type of software application.",
            "A network of interconnected databases.",
            1
        )
        databases.add(quest1)

        val quest2 = Questions(
            2,
            "What is SQL (Structured Query Language)?",
            "A programming language used for creating software applications.",
            "A type of database.",
            "A language used for managing and manipulating relational databases.",
            "A type of software framework.",
            3
        )
        databases.add(quest2)

        val quest3 = Questions(
            3,
            "What is a relational database?",
            "A database that stores data in tables and allows relationships to be established between different tables.",
            "A type of database that uses graphs to represent and store data.",
            "A database that organizes data in hierarchical structures.",
            "A database that stores data in files.",
            1
        )
        databases.add(quest3)

        val quest4 = Questions(
            4,
            "What is NoSQL?",
            "A type of database that does not use SQL for querying and manipulating data.",
            "A type of SQL database.",
            "A type of database that organizes data in hierarchical structures.",
            "A type of database that uses graphs to represent and store data.",
            1
        )
        databases.add(quest4)

        val quest5 = Questions(
            5,
            "What is ACID in the context of databases?",
            "A database management system.",
            "A type of database.",
            "A set of properties that guarantee database transactions are processed reliably.",
            "A programming language used for creating software applications.",
            3
        )
        databases.add(quest5)

        val quest6 = Questions(
            6,
            "What is a transaction in a database?",
            "A collection of data organized in rows and columns.",
            "A unit of work performed within a database management system against a database.",
            "A type of database.",
            "A network of interconnected databases.",
            2
        )
        databases.add(quest6)

        val quest7 = Questions(
            7,
            "What is indexing in databases?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to improve the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "A software development methodology.",
            "A network of interconnected databases.",
            2
        )
        databases.add(quest7)

        val quest8 = Questions(
            8,
            "What is a primary key in a database?",
            "A field in a database table that uniquely identifies each record in the table.",
            "A type of database.",
            "A technique used to improve the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "A network of interconnected databases.",
            1
        )
        databases.add(quest8)

        val quest9 = Questions(
            9,
            "What is a foreign key in a database?",
            "A field in a database table that uniquely identifies each record in the table.",
            "A type of database.",
            "A field in a database table that refers to the primary key of another table.",
            "A network of interconnected databases.",
            3
        )
        databases.add(quest9)

        val quest10 = Questions(
            10,
            "What is database normalization?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to organize data in a database efficiently.",
            "A type of database.",
            "A network of interconnected databases.",
            2
        )
        databases.add(quest10)

        val quest11 = Questions(
            11,
            "What is denormalization in databases?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to organize data in a database efficiently.",
            "A technique used to improve the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "A type of database.",
            3
        )
        databases.add(quest11)

        val quest12 = Questions(
            12,
            "What is a database schema?",
            "A collection of data organized in rows and columns.",
            "A type of database.",
            "A structured representation of the data in a database, including tables, fields, and relationships.",
            "A network of interconnected databases.",
            3
        )
        databases.add(quest12)

        val quest13 = Questions(
            13,
            "What is CAP theorem in the context of databases?",
            "A database management system.",
            "A theory about the trade-offs between consistency, availability, and partition tolerance in distributed systems.",
            "A theory about the structure of data in databases.",
            "A programming language used for creating software applications.",
            2
        )
        databases.add(quest13)

        val quest14 = Questions(
            14,
            "What is sharding in databases?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to improve the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "A database management system.",
            "A technique used to horizontally partition data in a database across multiple servers to improve performance and scalability.",
            4
        )
        databases.add(quest14)

        val quest15 = Questions(
            15,
            "What is a database view?",
            "A collection of data organized in rows and columns.",
            "A type of database.",
            "A virtual table that represents a stored query of the data in one or more tables.",
            "A network of interconnected databases.",
            3
        )
        databases.add(quest15)

        val quest16 = Questions(
            16,
            "What is a stored procedure in a database?",
            "A collection of data organized in rows and columns.",
            "A type of database.",
            "A group of SQL statements that can be called as a single unit from within a database.",
            "A network of interconnected databases.",
            3
        )
        databases.add(quest16)

        val quest17 = Questions(
            17,
            "What is database replication?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to improve the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "The process of copying data from one database to another to ensure that the data remains consistent across different locations.",
            "A type of database.",
            3
        )
        databases.add(quest17)

        val quest18 = Questions(
            18,
            "What is database partitioning?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to improve the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "A technique used to horizontally partition data in a database across multiple servers to improve performance and scalability.",
            "A type of database.",
            3
        )
        databases.add(quest18)

        val quest19 = Questions(
            19,
            "What is ACID in the context of databases?",
            "A database management system.",
            "A type of database.",
            "A set of properties that guarantee database transactions are processed reliably.",
            "A programming language used for creating software applications.",
            3
        )
        databases.add(quest19)

        val quest20 = Questions(
            20,
            "What is a database index?",
            "A collection of data organized in rows and columns.",
            "A type of database.",
            "A data structure that improves the speed of data retrieval operations on a database table at the cost of additional space and processing time.",
            "A network of interconnected databases.",
            3
        )
        databases.add(quest20)

        val quest21 = Questions(
            21,
            "What is database caching?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to store frequently accessed data in memory to reduce the need to fetch it from the main database.",
            "A database management system.",
            "A type of database.",
            2
        )
        databases.add(quest21)

        val quest22 = Questions(
            22,
            "What is database locking?",
            "A process for planning, creating, testing, and deploying software.",
            "A technique used to prevent multiple users from accessing or modifying the same data simultaneously in a database.",
            "A database management system.",
            "A type of database.",
            2
        )
        databases.add(quest22)


        return databases
    }

    fun getRandQuest(): MutableList<Questions> {
        val randomQst = mutableListOf<Questions>()
        for (i in 1 until 23) {
            val quest1 = getRandomQuestion()
            randomQst.add(quest1)
        }

        return randomQst
    }

    fun getRandomQuestion(): Questions {
        val randomCategory = Random.nextInt(1, 6)
        val randomQuestionIndex =
            Random.nextInt(1, 22)

        val questionsList = when (randomCategory) {
            1 -> Constants.getbasicQuestions()
            2 -> Constants.getdsQuestions()
            3 -> Constants.getalgorithmQuestions()
            4 -> Constants.getseQuestions()
            5 -> Constants.getdbQuestions()
            else -> Constants.getbasicQuestions()
        }

        return questionsList[randomQuestionIndex - 1]
    }
}