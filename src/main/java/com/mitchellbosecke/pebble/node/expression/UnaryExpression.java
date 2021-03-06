/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Copyright (c) 2014 by Mitchell Bösecke
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.mitchellbosecke.pebble.node.expression;

import com.mitchellbosecke.pebble.extension.NodeVisitor;

public abstract class UnaryExpression implements Expression<Object> {

    private Expression<?> childExpression;

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

    public Expression<?> getChildExpression() {
        return childExpression;
    }

    public void setChildExpression(Expression<?> childExpression) {
        this.childExpression = childExpression;
    }

}
