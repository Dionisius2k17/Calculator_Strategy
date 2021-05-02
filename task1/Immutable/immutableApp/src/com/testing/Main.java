package com.testing;

import java.util.*;
import jdk.nashorn.internal.ir.annotations.Immutable;

public class Main {
    static final class Foo{
        private final long id;
        private final String name;
        private final Date timestamp;
        private final List<String> tags;

        public Foo (long id, String name, Date timestamp,
                    List<String> tags){
            this.id = id;
            this.name = name;
            this.timestamp = timestamp;
            this.tags = tags;
            List <String> tempTags = Arrays.asList();
            tempTags = Collections.unmodifiableList(tempTags);
        }

        public final Long getId(){
            return id;
        }

        public final String getName(){
            return name;
        }

        public final Date getTimestamp(){
            return timestamp;
        }

        public final List<String> getTags(){
            return tags;
        }
    }

    public static void main(String[] args) {
	    Foo foo = new Foo(1, "John", null, null);
        System.out.println(foo.getId());
        System.out.println(foo.getName());
        System.out.println(foo.getTimestamp());
        System.out.println(foo.getTags());
    }
}
