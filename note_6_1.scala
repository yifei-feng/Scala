/***

Lecture 6-1 Basics of Scala Collection List 
https://www.imooc.com/video/11276

***/


/* 1 Define a list */
val a = List(1, 2, 3, 4)
a
a(0)

/* 2 :: connection operator,
Format is "element::list"*/
val b = 0 :: a
b
b(0)

val c = "x"::"y"::"z"::Nil
c
c(0)

/* 3 ::: another connection operator */
val d = a ::: c // d: List[Any]
d
d(0)

/* 4 visit element of a list */
// 4.1 head
// return the first element of List
a.head // 1
b.head // 0
c.head // "x"
d.head // 1, type is Any

// 4.2 tail
// return a List consisting of all the elements of the original list but the first one
// the returned list is called psedo list
a.tail
b.tail

// 4.3 isEmpty
// return a Boolean
a.isEmpty
Nil.isEmpty // true

/* 5 Tranverse a List */
def walkthru(l:List[Int]):String = {
  if(l.isEmpty) ""
  else l.head.toString + " " + walkthru(l.tail)
}
walkthru(a)
