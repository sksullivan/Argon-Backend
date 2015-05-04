package com.sks.ArgonBackend;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by them on 5/3/15.
 */
public class ARDBController {
    private static Morphia morphia;
    private static Datastore ds;
    private static MongoClient mongoClient;

    public static void initDBConnection() {
        morphia = new Morphia();
        mongoClient = new MongoClient(ARConstants.MONGO_HOST, ARConstants.MONGO_PORT);
        mongoClient.setWriteConcern(WriteConcern.JOURNALED);

        morphia.map(ARComponent.class);
        ds = morphia.createDatastore(mongoClient, ARConstants.DB_NAME);
    }

    public static void seedDB() {
        ds.save(new ARComponent("winner", "2win4you"));
    }

    public static Datastore getDatastore() {
        return ds;
    }
}
