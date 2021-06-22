package ink.zhiyi.hello.domain;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class ComicSerializer extends StdSerializer<Comic> {
//    但我们需要继承父类的时候，需要实例化父类，即子类实例化的时候必须调用父类

    public ComicSerializer() {
        // 无参调用有参是因为父类必须要一个Class<Comic>的属性
        this(null);
    }
//    显然父类有个Class<Comic>的属性
    protected ComicSerializer(Class<Comic> t) {
        super(t);
    }

    @Override
//    自定义序列化,即自定义我们接口返回的值
    public void serialize(Comic comic, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
//        注意这边是不一样的
        jsonGenerator.writeNumberField("id", comic.getId());
        jsonGenerator.writeEndObject();
    }
}