package examples;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.docgen.Source;

@Source
public class Examples {

  public void example1(Vertx vertx) {
    JsonObject json = new JsonObject();
    json.put("key", "\u0000\u0001\u0080\u009f\u00a0\u00ff");
  }
}
