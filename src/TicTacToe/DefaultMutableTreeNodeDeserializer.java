/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Daniel
 */
public class DefaultMutableTreeNodeDeserializer extends JsonDeserializer<DefaultMutableTreeNode> {

    @Override
    public DefaultMutableTreeNode deserialize(JsonParser parser, DeserializationContext context)
            throws IOException {
        return parser.readValueAs(POJO.class).toDefaultMutableTreeNode();
    }


    private static class POJO {

        private boolean allowsChildren;
        private Object userObject;
        private List<POJO> children;
        // no need for: POJO parent

        public DefaultMutableTreeNode toDefaultMutableTreeNode() {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode();
            node.setAllowsChildren(allowsChildren);
            node.setUserObject(userObject);
            if (children != null) {
                for (POJO child : children) {
                    node.add(child.toDefaultMutableTreeNode());  // recursion
                    // this did also set the parent of the child-node
                }
            }
            return node;
        }

        // Following setters needed by Jackson's deserialization:

        public void setAllowsChildren(boolean allowsChildren) {
            this.allowsChildren = allowsChildren;
        }

        public void setUserObject(Object userObject) {
            this.userObject = userObject;
        }

        public void setChildren(List<POJO> children) {
            this.children = children;
        }
    }
}