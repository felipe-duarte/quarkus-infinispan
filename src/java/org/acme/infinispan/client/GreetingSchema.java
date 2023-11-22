package org.acme.infinispan.client;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = Greeting.class, schemaPackageName = "greeting_sample")
public interface GreetingSchema extends GeneratedSchema {
}
