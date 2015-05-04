package com.sks.ArgonBackend;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Class to hold a data pertaining to a flowchart component.
 */
@Entity("arcomponents")
@Getter @Setter
public class ARComponent {
    @Id private ObjectId id;

    private String displayName;
    private String componentType;

    public ARComponent() {
        displayName = "";
        componentType = "";
    }

    public ARComponent(String displayName, String componentType) {
        this.displayName = displayName;
        this.componentType = componentType;
    }
}
