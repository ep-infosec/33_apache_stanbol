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
package org.apache.stanbol.rules.base;

/* CVS $Id: SWRL.java 1082452 2011-03-17 12:21:50Z concelvio $ */

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * Vocabulary definitions from http://www.w3.org/Submission/SWRL/swrl.owl
 * 
 * @author Auto-generated by schemagen on 15 feb 2010 15:40
 */
public final class SWRL {

    /**
     * Restrict instantiation
     */
    private SWRL() {}

    /**
     * <p>
     * The RDF model that holds the vocabulary terms
     * </p>
     */
    private static Model m_model = ModelFactory.createDefaultModel();

    /**
     * <p>
     * The namespace of the vocabulary as a string
     * </p>
     */
    public static final String NS = "http://www.w3.org/2003/11/swrl#";

    /**
     * <p>
     * The namespace of the vocabulary as a string
     * </p>
     * 
     * @see #NS
     */
    public static String getURI() {
        return "http://www.w3.org/Submission/SWRL/swrl.owl";
    }

    /**
     * <p>
     * The namespace of the vocabulary as a resource
     * </p>
     */
    public static final Resource NAMESPACE = m_model.createResource(NS);

    /**
     * <p>
     * can be a Literal or Resource
     * </p>
     */

    public static final Property argument1 = m_model
            .createProperty("http://www.w3.org/2003/11/swrl#argument1");

    public static final Property argument2 = m_model
            .createProperty("http://www.w3.org/2003/11/swrl#argument2");

    public static final Property classPredicate = m_model
            .createProperty("http://www.w3.org/2003/11/swrl#classPredicate");

    public static final Property propertyPredicate = m_model
            .createProperty("http://www.w3.org/2003/11/swrl#propertyPredicate");

    public static final Property body = m_model.createProperty("http://www.w3.org/2003/11/swrl#body");

    public static final Property head = m_model.createProperty("http://www.w3.org/2003/11/swrl#head");

    /**
     * <p>
     * common superclass
     * </p>
     */
    public static final Resource Atom = m_model.createResource("http://www.w3.org/2003/11/swrl#Atom");

    public static final Resource AtomList = m_model.createResource("http://www.w3.org/2003/11/swrl#AtomList");

    public static final Resource Builtin = m_model.createResource("http://www.w3.org/2003/11/swrl#Builtin");

    /**
     * <p>
     * consists of a builtin and a List of arguments
     * </p>
     */
    public static final Resource BuiltinAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#BuiltinAtom");

    /**
     * <p>
     * consists of a classPredicate and argument1
     * </p>
     */
    public static final Resource ClassAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#ClassAtom");

    /**
     * <p>
     * consists of a dataRange and argument1
     * </p>
     */
    public static final Resource DataRangeAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#DataRangeAtom");

    /**
     * <p>
     * consists of a propertyPredicate (owl:DatatypeProperty), argument1 (owl:Thing), and argument2
     * (rdfs:Literal)
     * </p>
     */
    public static final Resource DatavaluedPropertyAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#DatavaluedPropertyAtom");

    /**
     * <p>
     * consists of argument1 (owl:Thing) and argument2 (owl:Thing)
     * </p>
     */
    public static final Resource DifferentIndividualsAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#DifferentIndividualsAtom");

    /**
     * <p>
     * implication (rule)
     * </p>
     */
    public static final Resource Imp = m_model.createResource("http://www.w3.org/2003/11/swrl#Imp");

    /**
     * <p>
     * consists of a propertyPredicate (owl:ObjectProperty), argument1 (owl:Thing), and argument2 (owl:Thing)
     * </p>
     */
    public static final Resource IndividualPropertyAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#IndividualPropertyAtom");

    /**
     * <p>
     * consists of argument1 (owl:Thing) and argument2 (owl:Thing)
     * </p>
     */
    public static final Resource SameIndividualAtom = m_model
            .createResource("http://www.w3.org/2003/11/swrl#SameIndividualAtom");

    /**
     * <p>
     * indicate that a URI is being used as a variable
     * </p>
     */
    public static final Resource Variable = m_model.createResource("http://www.w3.org/2003/11/swrl#Variable");

    public static final Resource nil = m_model
            .createResource("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil");

}
