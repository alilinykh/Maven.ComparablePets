package io.zipcoder;

import java.util.Comparator;

abstract public class Pet implements Comparable <Pet>{
    String name;
    String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }
    public Pet (){
        name = "Pet";
        kind = "Kind";
    }

abstract public String speak ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    public int compareTo(Pet o) {
        if (this.name.toUpperCase().compareTo(o.name.toUpperCase()) > 0 ) {
            return 1;
        }
        else if (this.name.toUpperCase().compareTo(o.name.toUpperCase()) < 0) {
            return -1;
        }
        else  {
            if (this.kind.toUpperCase().compareTo(o.name.toUpperCase()) > 0) {
                return 1;
            }
            else if (this.kind.toUpperCase().compareTo(o.name.toUpperCase()) < 0) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
