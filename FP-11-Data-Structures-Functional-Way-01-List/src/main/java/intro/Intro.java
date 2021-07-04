package intro;

public class Intro {

    /**
     * Functional Data Structure
     * 1. Not imperative, implemented in functional way:
     *      - Functional DS don't have any imperative features - there will be no updates or modifications, and no such
     *      operations that will have side effects
     *
     * 2. Always Immutable and Persistent:
     *      In java there are mutable data structures present in Collection API, if you look at the available methods,
     *      many of them have VOID return type, which means that this method is mutating the state of passed object rather
     *      creating a new object, therefore mutable collections are not thread safe.
     *
     * 3. Persistence
     *      Any modification occurs in data structure -> have to preserve th previous state of itself
     *      Any modification on a functional data structure does not change the existing version, it produces a new version for that
     *
     * 4. Methods of functional data structures are referentially transparent
     *      Call a function once, catch the value, and later you can use it anywhere - simpler means, that for some given
     *      input the output will always be the same
     *
     *      Mutable data structure - Need to guard access
     *                               Put locks
     *                               Take care of synchronization
     *
     *      Functional data structure - Secure
     *                                  Immutable
     */


}
