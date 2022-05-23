package Onlab.onlab6;

class Bai2114 {
    public int mostWordsFound(String[] sentences) {

        int length = 0;

        for (String line : sentences)
            if (line.split(" ").length > length)
                length = line.split(" ").length;

        return length;
    }
}