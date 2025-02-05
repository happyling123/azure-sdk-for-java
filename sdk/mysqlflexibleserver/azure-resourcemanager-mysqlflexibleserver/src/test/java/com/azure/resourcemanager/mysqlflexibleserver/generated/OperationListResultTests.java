// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationDisplay;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"e\",\"display\":{\"provider\":\"onpc\",\"resource\":\"ocohslkevleg\",\"operation\":\"fbuhfmvfaxkffe\",\"description\":\"th\"},\"origin\":\"m\",\"properties\":{\"hxmzsbbzoggig\":\"datav\",\"ydptkoen\":\"dataxwburvjxxjns\"}},{\"name\":\"uknvudwti\",\"display\":{\"provider\":\"ldngkpoci\",\"resource\":\"z\",\"operation\":\"o\",\"description\":\"ukgjnpiucgygevq\"},\"origin\":\"typmrbpizcdrqjsd\",\"properties\":{\"eoejzic\":\"datanfyhx\",\"hajdeyeamdpha\":\"dataifsjttgzfbishcb\",\"wkgshwa\":\"dataalpbuxwgipwhon\",\"bin\":\"datakix\"}},{\"name\":\"pu\",\"display\":{\"provider\":\"rywn\",\"resource\":\"oqftiyqzrnkcq\",\"operation\":\"xlwhzlsicoh\",\"description\":\"qnwvlrya\"},\"origin\":\"hheunmmqhgyx\",\"properties\":{\"koklya\":\"datanoc\",\"ewrmjmwvvjektc\":\"datauconuqszfkbey\"}},{\"name\":\"enhwlrs\",\"display\":{\"provider\":\"zpwv\",\"resource\":\"dqgbiqylihkaetc\",\"operation\":\"vfcivfsnkymuc\",\"description\":\"hjfbebrjcxe\"},\"origin\":\"uwutttxfvjrbi\",\"properties\":{\"jky\":\"dataxepcyvahfn\",\"ljyoxgvcltb\":\"dataxjvuujqgidokg\",\"bijhtxfvgxbf\":\"datasncghkjeszz\",\"ec\":\"datamxnehmp\"}}],\"nextLink\":\"odebfqkkrbmpu\"}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("e", model.value().get(0).name());
        Assertions.assertEquals("onpc", model.value().get(0).display().provider());
        Assertions.assertEquals("ocohslkevleg", model.value().get(0).display().resource());
        Assertions.assertEquals("fbuhfmvfaxkffe", model.value().get(0).display().operation());
        Assertions.assertEquals("th", model.value().get(0).display().description());
        Assertions.assertEquals("m", model.value().get(0).origin());
        Assertions.assertEquals("odebfqkkrbmpu", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("e")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("onpc")
                                        .withResource("ocohslkevleg")
                                        .withOperation("fbuhfmvfaxkffe")
                                        .withDescription("th"))
                                .withOrigin("m")
                                .withProperties(mapOf("hxmzsbbzoggig", "datav", "ydptkoen", "dataxwburvjxxjns")),
                            new OperationInner()
                                .withName("uknvudwti")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("ldngkpoci")
                                        .withResource("z")
                                        .withOperation("o")
                                        .withDescription("ukgjnpiucgygevq"))
                                .withOrigin("typmrbpizcdrqjsd")
                                .withProperties(
                                    mapOf(
                                        "eoejzic",
                                        "datanfyhx",
                                        "hajdeyeamdpha",
                                        "dataifsjttgzfbishcb",
                                        "wkgshwa",
                                        "dataalpbuxwgipwhon",
                                        "bin",
                                        "datakix")),
                            new OperationInner()
                                .withName("pu")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("rywn")
                                        .withResource("oqftiyqzrnkcq")
                                        .withOperation("xlwhzlsicoh")
                                        .withDescription("qnwvlrya"))
                                .withOrigin("hheunmmqhgyx")
                                .withProperties(mapOf("koklya", "datanoc", "ewrmjmwvvjektc", "datauconuqszfkbey")),
                            new OperationInner()
                                .withName("enhwlrs")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("zpwv")
                                        .withResource("dqgbiqylihkaetc")
                                        .withOperation("vfcivfsnkymuc")
                                        .withDescription("hjfbebrjcxe"))
                                .withOrigin("uwutttxfvjrbi")
                                .withProperties(
                                    mapOf(
                                        "jky",
                                        "dataxepcyvahfn",
                                        "ljyoxgvcltb",
                                        "dataxjvuujqgidokg",
                                        "bijhtxfvgxbf",
                                        "datasncghkjeszz",
                                        "ec",
                                        "datamxnehmp"))))
                .withNextLink("odebfqkkrbmpu");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("e", model.value().get(0).name());
        Assertions.assertEquals("onpc", model.value().get(0).display().provider());
        Assertions.assertEquals("ocohslkevleg", model.value().get(0).display().resource());
        Assertions.assertEquals("fbuhfmvfaxkffe", model.value().get(0).display().operation());
        Assertions.assertEquals("th", model.value().get(0).display().description());
        Assertions.assertEquals("m", model.value().get(0).origin());
        Assertions.assertEquals("odebfqkkrbmpu", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
