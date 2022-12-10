/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.stanbol.rules.adapters.clerezza.atoms;

import java.util.ArrayList;
import java.util.List;

import org.apache.clerezza.rdf.core.sparql.query.BuiltInCall;
import org.apache.clerezza.rdf.core.sparql.query.ConstructQuery;
import org.apache.clerezza.rdf.core.sparql.query.Expression;
import org.apache.stanbol.rules.adapters.AbstractAdaptableAtom;
import org.apache.stanbol.rules.adapters.clerezza.ClerezzaSparqlObject;
import org.apache.stanbol.rules.base.api.RuleAtom;
import org.apache.stanbol.rules.base.api.RuleAtomCallExeption;
import org.apache.stanbol.rules.base.api.UnavailableRuleObjectException;
import org.apache.stanbol.rules.base.api.UnsupportedTypeForExportException;
import org.apache.stanbol.rules.manager.atoms.IObjectAtom;

/**
 * It adapts any StrAtom to the STR built in of Clerezza.
 * 
 * @author anuzzolese
 * 
 */
public class StrAtom extends AbstractAdaptableAtom {

    @SuppressWarnings("unchecked")
    @Override
    public <T> T adapt(RuleAtom ruleAtom) throws RuleAtomCallExeption,
                                         UnavailableRuleObjectException,
                                         UnsupportedTypeForExportException {

        org.apache.stanbol.rules.manager.atoms.StrAtom tmp = (org.apache.stanbol.rules.manager.atoms.StrAtom) ruleAtom;

        IObjectAtom uriResource = tmp.getUriResource();

        ClerezzaSparqlObject clerezzaSparqlObject = (ClerezzaSparqlObject) adapter.adaptTo(uriResource,
            ConstructQuery.class);

        List<Expression> expressions = new ArrayList<Expression>();
        expressions.add((Expression) clerezzaSparqlObject.getClerezzaObject());

        return (T) new ClerezzaSparqlObject(new BuiltInCall("STR", expressions));
    }

}
