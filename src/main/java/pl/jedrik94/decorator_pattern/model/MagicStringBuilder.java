package pl.jedrik94.decorator_pattern.model;

import java.util.stream.IntStream;

public class MagicStringBuilder {
    private StringBuilder stringBuilder;

    public MagicStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public MagicStringBuilder(String string) {
        this.stringBuilder = new StringBuilder(string);
    }

    public MagicStringBuilder concate(String string) {
        return new MagicStringBuilder(stringBuilder.toString().concat(string));
    }

    public MagicStringBuilder appendLine(String string) {
        stringBuilder.append(string).append(System.lineSeparator());
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public MagicStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        return this;
    }

    public MagicStringBuilder append(String str) {
        stringBuilder.append(str);
        return this;
    }

    public MagicStringBuilder append(StringBuffer sb) {
        stringBuilder.append(sb);
        return this;
    }

    public MagicStringBuilder append(CharSequence s) {
        stringBuilder.append(s);
        return this;
    }

    public MagicStringBuilder append(CharSequence s, int start, int end) {
        stringBuilder.append(s, start, end);
        return this;
    }

    public MagicStringBuilder append(char[] str) {
        stringBuilder.append(str);
        return this;
    }

    public MagicStringBuilder append(char[] str, int offset, int len) {
        stringBuilder.append(str, offset, len);
        return this;
    }

    public MagicStringBuilder append(boolean b) {
        stringBuilder.append(b);
        return this;
    }

    public MagicStringBuilder append(char c) {
        stringBuilder.append(c);
        return this;
    }

    public MagicStringBuilder append(int i) {
        stringBuilder.append(i);
        return this;
    }

    public MagicStringBuilder append(long lng) {
        stringBuilder.append(lng);
        return this;
    }

    public MagicStringBuilder append(float f) {
        stringBuilder.append(f);
        return this;
    }

    public MagicStringBuilder append(double d) {
        stringBuilder.append(d);
        return this;
    }

    public MagicStringBuilder appendCodePoint(int codePoint) {
        stringBuilder.appendCodePoint(codePoint);
        return this;
    }

    public MagicStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        return this;
    }

    public MagicStringBuilder deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        return this;
    }

    public MagicStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        return this;
    }

    public MagicStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        return this;
    }

    public MagicStringBuilder insert(int offset, Object obj) {
        stringBuilder.insert(offset, obj);
        return this;
    }

    public MagicStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        return this;
    }

    public MagicStringBuilder insert(int offset, char[] str) {
        stringBuilder.insert(offset, str);
        return this;
    }

    public MagicStringBuilder insert(int dstOffset, CharSequence s) {
        stringBuilder.insert(dstOffset, s);
        return this;
    }

    public MagicStringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
        stringBuilder.insert(dstOffset, s, start, end);
        return this;
    }

    public MagicStringBuilder insert(int offset, boolean b) {
        stringBuilder.insert(offset, b);
        return this;
    }

    public MagicStringBuilder insert(int offset, char c) {
        stringBuilder.insert(offset, c);
        return this;
    }

    public MagicStringBuilder insert(int offset, int i) {
        stringBuilder.insert(offset, i);
        return this;
    }

    public MagicStringBuilder insert(int offset, long l) {
        stringBuilder.insert(offset, l);
        return this;
    }

    public MagicStringBuilder insert(int offset, float f) {
        stringBuilder.insert(offset, f);
        return this;
    }

    public MagicStringBuilder insert(int offset, double d) {
        stringBuilder.insert(offset, d);
        return this;
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return stringBuilder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public MagicStringBuilder reverse() {
        stringBuilder.reverse();
        return this;
    }

    public int length() {
        return stringBuilder.length();
    }

    public int capacity() {
        return stringBuilder.capacity();
    }

    public void ensureCapacity(int minimumCapacity) {
        stringBuilder.ensureCapacity(minimumCapacity);
    }

    public void trimToSize() {
        stringBuilder.trimToSize();
    }

    public void setLength(int newLength) {
        stringBuilder.setLength(newLength);
    }

    public char charAt(int index) {
        return stringBuilder.charAt(index);
    }

    public int codePointAt(int index) {
        return stringBuilder.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return stringBuilder.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return stringBuilder.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return stringBuilder.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        stringBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public void setCharAt(int index, char ch) {
        stringBuilder.setCharAt(index, ch);
    }

    public String substring(int start) {
        return stringBuilder.substring(start);
    }

    public CharSequence subSequence(int start, int end) {
        return stringBuilder.subSequence(start, end);
    }

    public String substring(int start, int end) {
        return stringBuilder.substring(start, end);
    }

    public IntStream chars() {
        return stringBuilder.chars();
    }

    public IntStream codePoints() {
        return stringBuilder.codePoints();
    }
}
