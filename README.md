# java-OCP-11-816-exam
some demos to get ready for the second part of the Java Certification, OCP Java 11 Part 2


I  passed it on August, the 6th, 2020. Before the book was been published :-D

### Lessons learned 
It´s important to inspect the javadocs carefully. 
All the methods, their parameters, the return types and exceptions thrown. Learn them carefully. Make some demos too.

jdes, jdkinternal

### Online documentation
https://docs.oracle.com/javase/tutorial/
https://docs.oracle.com/en/java/javase/11/
https://docs.oracle.com/javase/specs/jls/se11/html/index.html#
http://openjdk.java.net/projects/jigsaw/spec/sotms/

### Important classes and interfaces you have to know well to pass the exam
- Stream
- Collectors
- Path && Paths
- File & Files
- Collections:  Deque, ArrayDeque, LinkedList, Map, Hashmap, Set, etc.
- Arrays
- Objects
- Comparator, Comparable
- Consumer, Supplier, BiConsumer,etc
- Runnable, Callable,ExecutorService, CyclicBarrier
- Function, BiFunction, etc
- IntStream, Doublestream
- Printstream, Filestream
- DecimalFormat, etc.
- Input, Outputstream

## Objectives:
https://education.oracle.com/de/java-se-11-programmer-ii/pexam_1Z0-816

----------------------------------------------------------------------

### OBJECTIVE: Secure Coding in Java SE Application
https://www.oracle.com/java/technologies/javase/seccodeguide.html

----------------------------------------------------------------------

### OBJECTIVE: Localization

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Locale.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ResourceBundle.html
https://docs.oracle.com/javase/tutorial/i18n/format/simpleFormat.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/package-summary.html
https://docs.oracle.com/javase/tutorial/i18n/format/messageFormat.html
https://docs.oracle.com/javase/tutorial/i18n/resbundle/list.html
https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html

----------------------------------------------------------------------

### OBJECTIVE: Lambda Operations on Streams, Parallel Streams, Services in a Modular Application

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html#sum()
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html#counting()
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html#partitioningBy(java.util.function.Predicate)

### OBJECTIVE: Migration to a Modular Application
https://docs.oracle.com/en/java/javase/11/migrate/index.html
https://docs.oracle.com/en/java/javase/11/tools/jdeps.html#GUID-A543FEBE-908A-49BF-996C-39499367ADB4
http://openjdk.java.net/projects/jigsaw/spec/sotms/#bottom-up-migration

### OBJECTIVE: Built-in Functional Interfaces
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
Use core functional interfaces including Predicate, Consumer, Function and Supplier
Use primitive and binary variations of base interfaces of java.util.function package

### OBJECTIVE: JDBC
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/Connection.html
https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/ResultSet.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/CallableStatement.html
https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/PreparedStatement.html
https://docs.oracle.com/javase/tutorial/jdbc/basics/connecting.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/DriverManager.html#getConnection(java.lang.String,java.lang.String,java.lang.String)
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/Connection.html#createStatement()
https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/DriverManager.html#getConnection(java.lang.String)
https://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ExecutorService.html

### OBJECTIVE: Threads 
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CopyOnWriteArrayList.html#iterator()
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Future.html#get()
https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
https://docs.oracle.com/javase/tutorial/essential/concurrency/atomic.html
https://docs.oracle.com/javase/tutorial/essential/concurrency/deadlock.html
https://docs.oracle.com/javase/tutorial/essential/concurrency/starvelive.html
https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html
https://docs.oracle.com/javase/tutorial/essential/concurrency/interfere.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ExecutorService.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CyclicBarrier.html

### Generics and Collections
https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#merge(K,V,java.util.function.BiFunction)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/TreeSet.html#higher(E)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#forEach(java.util.function.BiConsumer)
https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#removeIf(java.util.function.Predicate)
https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html
https://docs.oracle.com/javase/tutorial/java/generics/subtyping.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedHashSet.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CopyOnWriteArrayList.html#iterator()
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedHashMap.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#copyOf(java.util.Collection)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#compute(K,java.util.function.BiFunction)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/TreeSet.html#%3Cinit%3E(java.util.Collection)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html#unmodifiableList(java.util.List)
https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html
https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html


### OBJECTIVE: NIO
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html#walk(java.nio.file.Path,java.nio.file.FileVisitOption...)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html#move(java.nio.file.Path,java.nio.file.Path,java.nio.file.CopyOption...)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#relativize(java.nio.file.Path)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#getRoot()

----------------------------------------------------------------------

### OBJECTIVEs: others

https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.27
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#ifPresentOrElse(java.util.function.Consumer,java.lang.Runnable)
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/RetentionPolicy.html
https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.9.1
https://docs.oracle.com/javase/specs/jls/se11/html/jls-7.html#jls-7.7.4
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/AssertionError.html
https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.27
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Console.html
https://docs.oracle.com/javase/tutorial/i18n/locale/create.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/SuppressWarnings.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Override.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/System.html
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ServiceLoader.html
https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html#suppressed-exceptions
https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.9.2
http://openjdk.java.net/projects/jigsaw/spec/sotms/#the-unnamed-module
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Externalizable.html
https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html#intro
https://docs.oracle.com/javase/specs/jls/se11/html/jls-7.html#jls-7.7.4
https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html#usage
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/MessageFormat.html
https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
https://docs.oracle.com/javase/specs/jls/se11/html/jls-9.html#jls-9.6.4.5
https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html#enable-disable
https://docs.oracle.com/javase/tutorial/java/annotations/repeating.html
https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
https://docs.oracle.com/javase/tutorial/essential/exceptions/catchOrDeclare.html

and more...


Good luck!
