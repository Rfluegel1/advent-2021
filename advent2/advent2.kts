var lines: MutableList<String> = mutableListOf()

File("").forEachLine { line ->
    lines.add(line)
}

var depth: Int = 0
var forward: Int = 0

lines.forEach { line ->
    var order: String = line.split(' ').first()
    var magnitude: Int = line.split(' ').last().toInt()
    if (order == "forward") {
        forward += magnitude
    } else if (order == "down") {
        depth += magnitude
    } else if (order == "up") {
        depth -= magnitude
    }
}

println("depth " + depth)
println("forward " + forward)
println("depth times forward = " + depth*forward)