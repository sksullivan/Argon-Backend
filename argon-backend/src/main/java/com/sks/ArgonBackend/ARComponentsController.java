package com.sks.ArgonBackend;

import org.mongodb.morphia.Datastore;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Setup our API. Expose it to Maven.
 */

/**
  * Class defining basic API methods. Basically list all and get individual components.
 **/
@Controller
@EnableAutoConfiguration
public class ARComponentsController {

    /**
     * Method to return all components in database.
     */
    @RequestMapping("/")
    @ResponseBody
    public List<ARComponent> components() {
        List<ARComponent> componentsArray = ARDBController.getDatastore().find(ARComponent.class).asList();
        return componentsArray;
    }
}
