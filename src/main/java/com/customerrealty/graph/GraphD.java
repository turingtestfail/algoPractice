package com.customerrealty.graph;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class GraphD {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public Optional<Node> getNodeByName(String name){
        return nodes.stream().filter(f -> name.equals(f.getName())).findFirst();
    }
}
