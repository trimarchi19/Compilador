/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Collections;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Daniel
 */
public class DefaultMutableTreeNodeSerializer extends JsonSerializer<DefaultMutableTreeNode> {
    
    @Override
    public void serialize(DefaultMutableTreeNode node, JsonGenerator gen, SerializerProvider serializers)
            throws IOException {
        gen.writeStartObject();
        gen.writeBooleanField("allowsChildren", node.getAllowsChildren());
        gen.writeObjectField("userObject", node.getUserObject());
        if (node.getChildCount() > 0)
            gen.writeObjectField("children", Collections.list(node.children()));
        // Don't write node.getParent(), it would lead to infinite recursion.
        gen.writeEndObject();
    }


}
