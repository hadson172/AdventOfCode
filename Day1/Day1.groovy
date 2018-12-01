package AdventOfCode.Day1

import java.nio.file.Paths

def alreadySeen = [] as HashSet
def data = []
Paths.get("./data.txt").toFile().text.eachLine {data.add(it.toInteger())}


def done = false
def result = 0
while(!done) {
    done = data.find {
        result += it
        if (alreadySeen.find({it == result})) {
            println "Result $result"
            return true
        } else {
            alreadySeen.add(result)
        }
        return false
    }
}