package pl.jedrik94.builder_pattern.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

public class CodeBuilder
{
    private final String newLine = System.lineSeparator();
    private final int indentSize = 2;

    private String className;
    private LinkedHashMap<String, String> map;

    public CodeBuilder(String className)
    {
        this.map = new LinkedHashMap<>();
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
        map.put(name, type);

        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("public class %s%s", className, newLine));
        sb.append(String.format("{%s", newLine));

        Set<String> names = map.keySet();

        for (String name : names) {
            sb.append(String.join("", Collections.nCopies(indentSize, " ")));
            sb.append(String.format("public %s %s;%s", map.get(name), name, newLine));
        }

        sb.append("}");

        return sb.toString();
    }
}
