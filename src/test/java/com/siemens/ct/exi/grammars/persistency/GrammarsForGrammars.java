package com.siemens.ct.exi.grammars.persistency;

import javax.xml.namespace.QName;

import com.siemens.ct.exi.core.context.GrammarContext;
import com.siemens.ct.exi.core.context.GrammarUriContext;
import com.siemens.ct.exi.core.context.QNameContext;
import com.siemens.ct.exi.core.exceptions.UnsupportedOption;
import com.siemens.ct.exi.core.grammars.Grammars;
import com.siemens.ct.exi.core.grammars.SchemaInformedGrammars;
import com.siemens.ct.exi.core.grammars.grammar.Grammar;

public class GrammarsForGrammars implements Grammars {

	/* BEGIN GrammarContext ----- */
	final String ns0 = "";
	final QNameContext qnc0 = new QNameContext(0, 0, new QName(ns0,
			"documentGrammarID"));
	final QNameContext qnc1 = new QNameContext(0, 1, new QName(ns0,
			"elementFragmentGrammarID"));
	final QNameContext qnc2 = new QNameContext(0, 2, new QName(ns0,
			"fragmentGrammarID"));
	final QNameContext qnc3 = new QNameContext(0, 3, new QName(ns0,
			"grammarType"));
	final QNameContext qnc4 = new QNameContext(0, 4,
			new QName(ns0, "localName"));
	final QNameContext qnc5 = new QNameContext(0, 5, new QName(ns0,
			"namespaceURI"));
	final QNameContext[] grammarQNames0 = { qnc0, qnc1, qnc2, qnc3, qnc4, qnc5 };
	final String[] grammarPrefixes0 = { "" };
	final GrammarUriContext guc0 = new GrammarUriContext(0, ns0,
			grammarQNames0, grammarPrefixes0);

	final String ns1 = "http://www.w3.org/XML/1998/namespace";
	final QNameContext qnc6 = new QNameContext(1, 0, new QName(ns1, "base"));
	final QNameContext qnc7 = new QNameContext(1, 1, new QName(ns1, "id"));
	final QNameContext qnc8 = new QNameContext(1, 2, new QName(ns1, "lang"));
	final QNameContext qnc9 = new QNameContext(1, 3, new QName(ns1, "space"));
	final QNameContext[] grammarQNames1 = { qnc6, qnc7, qnc8, qnc9 };
	final String[] grammarPrefixes1 = { "xml" };
	final GrammarUriContext guc1 = new GrammarUriContext(1, ns1,
			grammarQNames1, grammarPrefixes1);

	final String ns2 = "http://www.w3.org/2001/XMLSchema-instance";
	final QNameContext qnc10 = new QNameContext(2, 0, new QName(ns2, "nil"));
	final QNameContext qnc11 = new QNameContext(2, 1, new QName(ns2, "type"));
	final QNameContext[] grammarQNames2 = { qnc10, qnc11 };
	final String[] grammarPrefixes2 = { "xsi" };
	final GrammarUriContext guc2 = new GrammarUriContext(2, ns2,
			grammarQNames2, grammarPrefixes2);

	final String ns3 = "http://www.w3.org/2001/XMLSchema";
	final QNameContext qnc12 = new QNameContext(3, 0,
			new QName(ns3, "ENTITIES"));
	final QNameContext qnc13 = new QNameContext(3, 1, new QName(ns3, "ENTITY"));
	final QNameContext qnc14 = new QNameContext(3, 2, new QName(ns3, "ID"));
	final QNameContext qnc15 = new QNameContext(3, 3, new QName(ns3, "IDREF"));
	final QNameContext qnc16 = new QNameContext(3, 4, new QName(ns3, "IDREFS"));
	final QNameContext qnc17 = new QNameContext(3, 5, new QName(ns3, "NCName"));
	final QNameContext qnc18 = new QNameContext(3, 6, new QName(ns3, "NMTOKEN"));
	final QNameContext qnc19 = new QNameContext(3, 7,
			new QName(ns3, "NMTOKENS"));
	final QNameContext qnc20 = new QNameContext(3, 8,
			new QName(ns3, "NOTATION"));
	final QNameContext qnc21 = new QNameContext(3, 9, new QName(ns3, "Name"));
	final QNameContext qnc22 = new QNameContext(3, 10, new QName(ns3, "QName"));
	final QNameContext qnc23 = new QNameContext(3, 11, new QName(ns3,
			"anySimpleType"));
	final QNameContext qnc24 = new QNameContext(3, 12,
			new QName(ns3, "anyType"));
	final QNameContext qnc25 = new QNameContext(3, 13, new QName(ns3, "anyURI"));
	final QNameContext qnc26 = new QNameContext(3, 14, new QName(ns3,
			"base64Binary"));
	final QNameContext qnc27 = new QNameContext(3, 15,
			new QName(ns3, "boolean"));
	final QNameContext qnc28 = new QNameContext(3, 16, new QName(ns3, "byte"));
	final QNameContext qnc29 = new QNameContext(3, 17, new QName(ns3, "date"));
	final QNameContext qnc30 = new QNameContext(3, 18, new QName(ns3,
			"dateTime"));
	final QNameContext qnc31 = new QNameContext(3, 19,
			new QName(ns3, "decimal"));
	final QNameContext qnc32 = new QNameContext(3, 20, new QName(ns3, "double"));
	final QNameContext qnc33 = new QNameContext(3, 21, new QName(ns3,
			"duration"));
	final QNameContext qnc34 = new QNameContext(3, 22, new QName(ns3, "float"));
	final QNameContext qnc35 = new QNameContext(3, 23, new QName(ns3, "gDay"));
	final QNameContext qnc36 = new QNameContext(3, 24, new QName(ns3, "gMonth"));
	final QNameContext qnc37 = new QNameContext(3, 25, new QName(ns3,
			"gMonthDay"));
	final QNameContext qnc38 = new QNameContext(3, 26, new QName(ns3, "gYear"));
	final QNameContext qnc39 = new QNameContext(3, 27, new QName(ns3,
			"gYearMonth"));
	final QNameContext qnc40 = new QNameContext(3, 28, new QName(ns3,
			"hexBinary"));
	final QNameContext qnc41 = new QNameContext(3, 29, new QName(ns3, "int"));
	final QNameContext qnc42 = new QNameContext(3, 30,
			new QName(ns3, "integer"));
	final QNameContext qnc43 = new QNameContext(3, 31, new QName(ns3,
			"language"));
	final QNameContext qnc44 = new QNameContext(3, 32, new QName(ns3, "long"));
	final QNameContext qnc45 = new QNameContext(3, 33, new QName(ns3,
			"negativeInteger"));
	final QNameContext qnc46 = new QNameContext(3, 34, new QName(ns3,
			"nonNegativeInteger"));
	final QNameContext qnc47 = new QNameContext(3, 35, new QName(ns3,
			"nonPositiveInteger"));
	final QNameContext qnc48 = new QNameContext(3, 36, new QName(ns3,
			"normalizedString"));
	final QNameContext qnc49 = new QNameContext(3, 37, new QName(ns3,
			"positiveInteger"));
	final QNameContext qnc50 = new QNameContext(3, 38, new QName(ns3, "short"));
	final QNameContext qnc51 = new QNameContext(3, 39, new QName(ns3, "string"));
	final QNameContext qnc52 = new QNameContext(3, 40, new QName(ns3, "time"));
	final QNameContext qnc53 = new QNameContext(3, 41, new QName(ns3, "token"));
	final QNameContext qnc54 = new QNameContext(3, 42, new QName(ns3,
			"unsignedByte"));
	final QNameContext qnc55 = new QNameContext(3, 43, new QName(ns3,
			"unsignedInt"));
	final QNameContext qnc56 = new QNameContext(3, 44, new QName(ns3,
			"unsignedLong"));
	final QNameContext qnc57 = new QNameContext(3, 45, new QName(ns3,
			"unsignedShort"));
	final QNameContext[] grammarQNames3 = { qnc12, qnc13, qnc14, qnc15, qnc16,
			qnc17, qnc18, qnc19, qnc20, qnc21, qnc22, qnc23, qnc24, qnc25,
			qnc26, qnc27, qnc28, qnc29, qnc30, qnc31, qnc32, qnc33, qnc34,
			qnc35, qnc36, qnc37, qnc38, qnc39, qnc40, qnc41, qnc42, qnc43,
			qnc44, qnc45, qnc46, qnc47, qnc48, qnc49, qnc50, qnc51, qnc52,
			qnc53, qnc54, qnc55, qnc56, qnc57 };
	final String[] grammarPrefixes3 = {};
	final GrammarUriContext guc3 = new GrammarUriContext(3, ns3,
			grammarQNames3, grammarPrefixes3);

	final String ns4 = "http://www.ct.siemens.com/exi/2017/SchemaForGrammars";
	final QNameContext qnc58 = new QNameContext(4, 0,
			new QName(ns4, "Datatype"));
	final QNameContext qnc59 = new QNameContext(4, 1, new QName(ns4,
			"DatatypeBasics"));
	final QNameContext qnc60 = new QNameContext(4, 2, new QName(ns4,
			"Enumeration"));
	final QNameContext qnc61 = new QNameContext(4, 3, new QName(ns4,
			"NamespaceContext"));
	final QNameContext qnc62 = new QNameContext(4, 4, new QName(ns4,
			"Production"));
	final QNameContext qnc63 = new QNameContext(4, 5, new QName(ns4,
			"attribute"));
	final QNameContext qnc64 = new QNameContext(4, 6, new QName(ns4,
			"attributeDatatypeID"));
	final QNameContext qnc65 = new QNameContext(4, 7, new QName(ns4,
			"attributeGeneric"));
	final QNameContext qnc66 = new QNameContext(4, 8, new QName(ns4,
			"attributeLocalNameID"));
	final QNameContext qnc67 = new QNameContext(4, 9, new QName(ns4,
			"attributeNS"));
	final QNameContext qnc68 = new QNameContext(4, 10, new QName(ns4,
			"attributeNamespaceID"));
	final QNameContext qnc69 = new QNameContext(4, 11, new QName(ns4,
			"base64Binary"));
	final QNameContext qnc70 = new QNameContext(4, 12, new QName(ns4,
			"base64BinaryValue"));
	final QNameContext qnc71 = new QNameContext(4, 13, new QName(ns4,
			"baseDatatypeID"));
	final QNameContext qnc72 = new QNameContext(4, 14,
			new QName(ns4, "boolean"));
	final QNameContext qnc73 = new QNameContext(4, 15, new QName(ns4,
			"booleanValue"));
	final QNameContext qnc74 = new QNameContext(4, 16, new QName(ns4,
			"characters"));
	final QNameContext qnc75 = new QNameContext(4, 17, new QName(ns4,
			"charactersDatatypeID"));
	final QNameContext qnc76 = new QNameContext(4, 18, new QName(ns4,
			"charactersGeneric"));
	final QNameContext qnc77 = new QNameContext(4, 19, new QName(ns4, "date"));
	final QNameContext qnc78 = new QNameContext(4, 20, new QName(ns4,
			"dateAndTime"));
	final QNameContext qnc79 = new QNameContext(4, 21, new QName(ns4,
			"dateTime"));
	final QNameContext qnc80 = new QNameContext(4, 22, new QName(ns4,
			"dateTimeValue"));
	final QNameContext qnc81 = new QNameContext(4, 23, new QName(ns4,
			"dateValue"));
	final QNameContext qnc82 = new QNameContext(4, 24,
			new QName(ns4, "decimal"));
	final QNameContext qnc83 = new QNameContext(4, 25, new QName(ns4,
			"decimalValue"));
	final QNameContext qnc84 = new QNameContext(4, 26, new QName(ns4, "double"));
	final QNameContext qnc85 = new QNameContext(4, 27, new QName(ns4,
			"elementContentGrammarID"));
	final QNameContext qnc86 = new QNameContext(4, 28, new QName(ns4,
			"endDocument"));
	final QNameContext qnc87 = new QNameContext(4, 29, new QName(ns4,
			"endElement"));
	final QNameContext qnc88 = new QNameContext(4, 30, new QName(ns4,
			"enumeration"));
	final QNameContext qnc89 = new QNameContext(4, 31, new QName(ns4,
			"enumerationValueDatatype"));
	final QNameContext qnc90 = new QNameContext(4, 32, new QName(ns4,
			"exiGrammars"));
	final QNameContext qnc91 = new QNameContext(4, 33, new QName(ns4,
			"floatValue"));
	final QNameContext qnc92 = new QNameContext(4, 34, new QName(ns4, "gDay"));
	final QNameContext qnc93 = new QNameContext(4, 35, new QName(ns4,
			"gDayValue"));
	final QNameContext qnc94 = new QNameContext(4, 36, new QName(ns4, "gMonth"));
	final QNameContext qnc95 = new QNameContext(4, 37, new QName(ns4,
			"gMonthDay"));
	final QNameContext qnc96 = new QNameContext(4, 38, new QName(ns4,
			"gMonthDayValue"));
	final QNameContext qnc97 = new QNameContext(4, 39, new QName(ns4,
			"gMonthValue"));
	final QNameContext qnc98 = new QNameContext(4, 40, new QName(ns4, "gYear"));
	final QNameContext qnc99 = new QNameContext(4, 41, new QName(ns4,
			"gYearMonth"));
	final QNameContext qnc100 = new QNameContext(4, 42, new QName(ns4,
			"gYearMonthValue"));
	final QNameContext qnc101 = new QNameContext(4, 43, new QName(ns4,
			"gYearValue"));
	final QNameContext qnc102 = new QNameContext(4, 44, new QName(ns4,
			"globalAttributeDatatypeID"));
	final QNameContext qnc103 = new QNameContext(4, 45, new QName(ns4,
			"globalComplexTypeGrammarID"));
	final QNameContext qnc104 = new QNameContext(4, 46, new QName(ns4,
			"globalElementGrammarID"));
	final QNameContext qnc105 = new QNameContext(4, 47, new QName(ns4,
			"globalSimpleTypeDatatypeID"));
	final QNameContext qnc106 = new QNameContext(4, 48, new QName(ns4,
			"grammar"));
	final QNameContext qnc107 = new QNameContext(4, 49, new QName(ns4,
			"grammarType"));
	final QNameContext qnc108 = new QNameContext(4, 50, new QName(ns4,
			"grammars"));
	final QNameContext qnc109 = new QNameContext(4, 51, new QName(ns4,
			"hexBinary"));
	final QNameContext qnc110 = new QNameContext(4, 52, new QName(ns4,
			"hexBinaryValue"));
	final QNameContext qnc111 = new QNameContext(4, 53, new QName(ns4,
			"integer"));
	final QNameContext qnc112 = new QNameContext(4, 54, new QName(ns4,
			"integerValue"));
	final QNameContext qnc113 = new QNameContext(4, 55, new QName(ns4,
			"isBuiltInXMLSchemaTypesOnly"));
	final QNameContext qnc114 = new QNameContext(4, 56, new QName(ns4,
			"isNillable"));
	final QNameContext qnc115 = new QNameContext(4, 57, new QName(ns4,
			"isTypeCastable"));
	final QNameContext qnc116 = new QNameContext(4, 58, new QName(ns4, "list"));
	final QNameContext qnc117 = new QNameContext(4, 59, new QName(ns4,
			"lowerBound"));
	final QNameContext qnc118 = new QNameContext(4, 60, new QName(ns4,
			"nBitUnsignedInteger"));
	final QNameContext qnc119 = new QNameContext(4, 61, new QName(ns4,
			"namespaceContext"));
	final QNameContext qnc120 = new QNameContext(4, 62, new QName(ns4,
			"nextGrammarID"));
	final QNameContext qnc121 = new QNameContext(4, 63, new QName(ns4,
			"patternFacet"));
	final QNameContext qnc122 = new QNameContext(4, 64, new QName(ns4,
			"production"));
	final QNameContext qnc123 = new QNameContext(4, 65, new QName(ns4,
			"qnameContext"));
	final QNameContext qnc124 = new QNameContext(4, 66,
			new QName(ns4, "qnames"));
	final QNameContext qnc125 = new QNameContext(4, 67, new QName(ns4,
			"restrictedCharSet"));
	final QNameContext qnc126 = new QNameContext(4, 68, new QName(ns4,
			"schemaTypeLocalNameID"));
	final QNameContext qnc127 = new QNameContext(4, 69, new QName(ns4,
			"schemaTypeNamespaceID"));
	final QNameContext qnc128 = new QNameContext(4, 70, new QName(ns4,
			"simpleDatatype"));
	final QNameContext qnc129 = new QNameContext(4, 71, new QName(ns4,
			"simpleDatatypes"));
	final QNameContext qnc130 = new QNameContext(4, 72, new QName(ns4,
			"startDocument"));
	final QNameContext qnc131 = new QNameContext(4, 73, new QName(ns4,
			"startElement"));
	final QNameContext qnc132 = new QNameContext(4, 74, new QName(ns4,
			"startElementGeneric"));
	final QNameContext qnc133 = new QNameContext(4, 75, new QName(ns4,
			"startElementGrammarID"));
	final QNameContext qnc134 = new QNameContext(4, 76, new QName(ns4,
			"startElementLocalNameID"));
	final QNameContext qnc135 = new QNameContext(4, 77, new QName(ns4,
			"startElementNS"));
	final QNameContext qnc136 = new QNameContext(4, 78, new QName(ns4,
			"startElementNamespaceID"));
	final QNameContext qnc137 = new QNameContext(4, 79,
			new QName(ns4, "string"));
	final QNameContext qnc138 = new QNameContext(4, 80, new QName(ns4,
			"stringValue"));
	final QNameContext qnc139 = new QNameContext(4, 81, new QName(ns4, "time"));
	final QNameContext qnc140 = new QNameContext(4, 82, new QName(ns4,
			"timeValue"));
	final QNameContext qnc141 = new QNameContext(4, 83, new QName(ns4,
			"unsignedInteger"));
	final QNameContext qnc142 = new QNameContext(4, 84, new QName(ns4,
			"upperBound"));
	final QNameContext[] grammarQNames4 = { qnc58, qnc59, qnc60, qnc61, qnc62,
			qnc63, qnc64, qnc65, qnc66, qnc67, qnc68, qnc69, qnc70, qnc71,
			qnc72, qnc73, qnc74, qnc75, qnc76, qnc77, qnc78, qnc79, qnc80,
			qnc81, qnc82, qnc83, qnc84, qnc85, qnc86, qnc87, qnc88, qnc89,
			qnc90, qnc91, qnc92, qnc93, qnc94, qnc95, qnc96, qnc97, qnc98,
			qnc99, qnc100, qnc101, qnc102, qnc103, qnc104, qnc105, qnc106,
			qnc107, qnc108, qnc109, qnc110, qnc111, qnc112, qnc113, qnc114,
			qnc115, qnc116, qnc117, qnc118, qnc119, qnc120, qnc121, qnc122,
			qnc123, qnc124, qnc125, qnc126, qnc127, qnc128, qnc129, qnc130,
			qnc131, qnc132, qnc133, qnc134, qnc135, qnc136, qnc137, qnc138,
			qnc139, qnc140, qnc141, qnc142 };
	final String[] grammarPrefixes4 = {};
	final GrammarUriContext guc4 = new GrammarUriContext(4, ns4,
			grammarQNames4, grammarPrefixes4);

	final GrammarUriContext[] grammarUriContexts = { guc0, guc1, guc2, guc3,
			guc4 };
	final GrammarContext gc = new GrammarContext(grammarUriContexts, 143);
	/* END GrammarContext ----- */

	/* BEGIN Grammars ----- */
	com.siemens.ct.exi.core.grammars.grammar.Document g0 = new com.siemens.ct.exi.core.grammars.grammar.Document();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedDocContent g1 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedDocContent();
	com.siemens.ct.exi.core.grammars.grammar.DocEnd g2 = new com.siemens.ct.exi.core.grammars.grammar.DocEnd();
	com.siemens.ct.exi.core.grammars.grammar.Fragment g3 = new com.siemens.ct.exi.core.grammars.grammar.Fragment();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFragmentContent g4 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFragmentContent();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g59 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g60 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g61 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g62 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g63 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g64 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g65 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g66 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g67 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g68 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g69 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g70 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g71 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g72 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g73 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g74 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g75 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g76 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g77 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g78 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g79 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g80 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g81 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g82 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g83 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g84 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g85 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g86 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g87 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g88 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g89 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g90 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g91 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g92 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g93 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g94 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g95 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g96 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g97 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g98 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g99 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g100 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g101 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g102 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g103 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g104 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g105 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g106 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g107 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g108 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g109 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g110 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g111 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g112 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g113 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g114 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g115 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g116 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g117 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g118 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g119 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g120 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g121 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g122 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g123 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g124 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g125 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g126 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g127 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g128 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g129 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g130 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g131 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g132 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g133 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g134 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g135 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement g136 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedElement();
	/* END Grammars ----- */

	/* BEGIN Grammars with element content ----- */
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g5 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g130);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g6 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g66);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g7 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g65);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g8 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g64);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g9 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g61);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g10 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g113);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g11 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g112);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g12 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g59);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g13 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g111);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g14 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g80);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g15 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g72);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g16 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g73);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g17 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g77);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g18 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g76);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g19 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g74);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g20 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g79);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g21 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g78);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g22 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g82);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g23 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g84);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g24 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g86);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g25 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g88);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g26 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g90);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g27 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g92);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g28 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g94);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g29 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g96);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g30 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g98);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g31 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g100);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g32 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g102);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g33 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g104);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g34 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g106);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g35 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g109);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g36 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g129);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g37 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g128);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g38 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g127);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g39 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g122);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g40 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g125);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g41 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g126);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g42 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g131);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g43 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g132);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g44 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g109);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g45 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g133);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g46 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g134);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g47 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g104);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g48 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g74);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g49 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g61);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g50 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g135);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g51 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g80);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag g52 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedFirstStartTag(
			g136);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag g53 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag(
			g65);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag g54 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag(
			g64);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag g55 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag(
			g129);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag g56 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag(
			g129);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag g57 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag(
			g129);
	com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag g58 = new com.siemens.ct.exi.core.grammars.grammar.SchemaInformedStartTag(
			g128);

	com.siemens.ct.exi.core.grammars.event.StartElement globalSE90 = new com.siemens.ct.exi.core.grammars.event.StartElement(
			qnc90, g5);

	protected String schemaId = "http://www.ct.siemens.com/exi/2017/SchemaForGrammars";

	void initGlobalElements() {
		/* BEGIN GlobalElements ----- */
		qnc90.setGlobalStartElement(globalSE90);
		/* END GlobalElements ----- */

	}

	void initGlobalAttributes() {
		/* BEGIN GlobalAttributes ----- */
		/* END GlobalAttributes ----- */

	}

	void initTypeGrammars() {
		/* BEGIN TypeGrammar ----- */
		qnc12.setTypeGrammar(g43);
		qnc13.setTypeGrammar(g44);
		qnc14.setTypeGrammar(g44);
		qnc15.setTypeGrammar(g44);
		qnc16.setTypeGrammar(g43);
		qnc17.setTypeGrammar(g44);
		qnc18.setTypeGrammar(g44);
		qnc19.setTypeGrammar(g43);
		qnc20.setTypeGrammar(g44);
		qnc21.setTypeGrammar(g44);
		qnc22.setTypeGrammar(g44);
		qnc23.setTypeGrammar(g44);
		qnc24.setTypeGrammar(g45);
		qnc25.setTypeGrammar(g44);
		qnc26.setTypeGrammar(g22);
		qnc27.setTypeGrammar(g24);
		qnc28.setTypeGrammar(g46);
		qnc29.setTypeGrammar(g27);
		qnc30.setTypeGrammar(g28);
		qnc31.setTypeGrammar(g47);
		qnc32.setTypeGrammar(g34);
		qnc33.setTypeGrammar(g44);
		qnc34.setTypeGrammar(g34);
		qnc35.setTypeGrammar(g31);
		qnc36.setTypeGrammar(g29);
		qnc37.setTypeGrammar(g30);
		qnc38.setTypeGrammar(g25);
		qnc39.setTypeGrammar(g26);
		qnc40.setTypeGrammar(g23);
		qnc41.setTypeGrammar(g48);
		qnc42.setTypeGrammar(g48);
		qnc43.setTypeGrammar(g44);
		qnc44.setTypeGrammar(g48);
		qnc45.setTypeGrammar(g48);
		qnc46.setTypeGrammar(g49);
		qnc47.setTypeGrammar(g48);
		qnc48.setTypeGrammar(g44);
		qnc49.setTypeGrammar(g49);
		qnc50.setTypeGrammar(g48);
		qnc51.setTypeGrammar(g44);
		qnc52.setTypeGrammar(g32);
		qnc53.setTypeGrammar(g44);
		qnc54.setTypeGrammar(g50);
		qnc55.setTypeGrammar(g49);
		qnc56.setTypeGrammar(g49);
		qnc57.setTypeGrammar(g49);
		qnc58.setTypeGrammar(g11);
		qnc59.setTypeGrammar(g51);
		qnc60.setTypeGrammar(g13);
		qnc61.setTypeGrammar(g7);
		qnc62.setTypeGrammar(g38);
		qnc107.setTypeGrammar(g52);
		/* END TypeGrammar ----- */

	}

	void initGrammarEvents() {
		/* BEGIN Grammar Events ----- */
		g0.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartDocument(), g1);
		g1.addProduction(globalSE90, g2);
		g1.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElementGeneric(),
				g2);
		g2.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndDocument(), g60);
		g3.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartDocument(), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc63,
						g39), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc64,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc65,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc66,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc67,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc68,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc70,
						g22), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc71,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc73,
						g24), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc74,
						g41), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc75,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc76,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc77,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc79,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc80,
						g28), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc81,
						g27), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc83,
						g33), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc86,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc87,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc88,
						g13), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc89,
						g14), g4);
		g4.addProduction(globalSE90, g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc91,
						g34), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc92,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc93,
						g31), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc94,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc95,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc96,
						g30), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc97,
						g29), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc98,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc99,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc100,
						g26), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc101,
						g25), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc103,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc105,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc106,
						g37), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc108,
						g36), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc110,
						g23), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc112,
						g19), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc113,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc114,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc115,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc116,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc117,
						g19), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc118,
						g18), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc119,
						g7), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc120,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc121,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc123,
						g8), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc124,
						g6), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc125,
						g21), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc126,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc127,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc128,
						g11), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc129,
						g10), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc130,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc131,
						g40), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc132,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc133,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc134,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc135,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc136,
						g9), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc138,
						g35), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc139,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc140,
						g32), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc141,
						g12), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc142,
						g19), g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElementGeneric(),
				g4);
		g4.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndDocument(), g60);
		g5.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc124,
						g6), g67);
		g6.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc119,
						g7), g66);
		g6.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g7.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc5,
				new com.siemens.ct.exi.core.datatype.StringDatatype(qnc51)),
				g53);
		g7.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc123,
						g8), g65);
		g7.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g8.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc4,
				new com.siemens.ct.exi.core.datatype.StringDatatype(qnc51)),
				g54);
		g8.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc105,
						g9), g62);
		g8.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc103,
						g9), g62);
		g8.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g63);
		g8.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g59);
		g8.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g9.addProduction(new com.siemens.ct.exi.core.grammars.event.Characters(
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g59);
		g10.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc128,
						g11), g113);
		g10.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g68);
		g11.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g68);
		g12.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g13.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc89,
						g14), g81);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g59);
		g14.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g59);
		g15.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc121,
						g12), g59);
		g15.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc79,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc139,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc77,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc99,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc98,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc95,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc92,
						g12), g59);
		g16.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc94,
						g12), g59);
		g17.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc141,
						g12), g59);
		g17.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc118,
						g18), g59);
		g17.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g18.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc117,
						g19), g75);
		g19.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.IntegerDatatype(
								qnc42)), g59);
		g20.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc125,
						g21), g59);
		g20.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g21.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.ListDatatype(
								new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
										qnc55), qnc23)), g59);
		g22.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.BinaryBase64Datatype(
								qnc26)), g59);
		g23.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.BinaryHexDatatype(
								qnc40)), g59);
		g24.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.BooleanDatatype(
								qnc27)), g59);
		g25.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gYear,
								qnc38)), g59);
		g26.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gYearMonth,
								qnc39)), g59);
		g27.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.date,
								qnc29)), g59);
		g28.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.dateTime,
								qnc30)), g59);
		g29.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gMonth,
								qnc36)), g59);
		g30.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gMonthDay,
								qnc37)), g59);
		g31.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gDay,
								qnc35)), g59);
		g32.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.time,
								qnc52)), g59);
		g33.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DecimalDatatype(
								qnc31)), g59);
		g34.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.FloatDatatype(
								qnc32)), g59);
		g35.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.StringDatatype(
								qnc51)), g59);
		g36.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc0,
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g55);
		g37.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc3, new com.siemens.ct.exi.core.datatype.EnumerationDatatype(
						new com.siemens.ct.exi.core.values.Value[] {
								new com.siemens.ct.exi.core.values.StringValue(
										"Document"),
								new com.siemens.ct.exi.core.values.StringValue(
										"DocContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"DocEnd"),
								new com.siemens.ct.exi.core.values.StringValue(
										"Fragment"),
								new com.siemens.ct.exi.core.values.StringValue(
										"FragmentContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"FirstStartTagContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"StartTagContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"ElementContent") },
						new com.siemens.ct.exi.core.datatype.StringDatatype(
								qnc51), qnc107)), g58);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc130,
						g12), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc86,
						g12), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc63,
						g39), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc67,
						g9), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc65,
						g12), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc131,
						g40), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc135,
						g9), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc132,
						g12), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc87,
						g12), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc74,
						g41), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc76,
						g12), g119);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc120,
						g9), g59);
		g38.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g39.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc68,
						g9), g120);
		g40.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc136,
						g9), g123);
		g41.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc75,
						g9), g59);
		g42.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc0,
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g42);
		g42.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc1,
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g42);
		g42.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc2,
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g42);
		g42.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc3, new com.siemens.ct.exi.core.datatype.EnumerationDatatype(
						new com.siemens.ct.exi.core.values.Value[] {
								new com.siemens.ct.exi.core.values.StringValue(
										"Document"),
								new com.siemens.ct.exi.core.values.StringValue(
										"DocContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"DocEnd"),
								new com.siemens.ct.exi.core.values.StringValue(
										"Fragment"),
								new com.siemens.ct.exi.core.values.StringValue(
										"FragmentContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"FirstStartTagContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"StartTagContent"),
								new com.siemens.ct.exi.core.values.StringValue(
										"ElementContent") },
						new com.siemens.ct.exi.core.datatype.StringDatatype(
								qnc51), qnc107)), g42);
		g42.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc4,
				new com.siemens.ct.exi.core.datatype.StringDatatype(qnc51)),
				g42);
		g42.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc5,
				new com.siemens.ct.exi.core.datatype.StringDatatype(qnc51)),
				g42);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.AttributeGeneric(),
				g42);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc63,
						g39), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc64,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc65,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc66,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc67,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc68,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc70,
						g22), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc71,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc73,
						g24), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc74,
						g41), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc75,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc76,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc77,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc79,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc80,
						g28), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc81,
						g27), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc83,
						g33), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc86,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc87,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc88,
						g13), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc89,
						g14), g131);
		g42.addProduction(globalSE90, g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc91,
						g34), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc92,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc93,
						g31), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc94,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc95,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc96,
						g30), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc97,
						g29), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc98,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc99,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc100,
						g26), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc101,
						g25), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc103,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc105,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc106,
						g37), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc108,
						g36), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc110,
						g23), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc112,
						g19), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc113,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc114,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc115,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc116,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc117,
						g19), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc118,
						g18), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc119,
						g7), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc120,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc121,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc123,
						g8), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc124,
						g6), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc125,
						g21), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc126,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc127,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc128,
						g11), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc129,
						g10), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc130,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc131,
						g40), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc132,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc133,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc134,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc135,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc136,
						g9), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc138,
						g35), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc139,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc140,
						g32), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc141,
						g12), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc142,
						g19), g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElementGeneric(),
				g131);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g42.addProduction(
				new com.siemens.ct.exi.core.grammars.event.CharactersGeneric(),
				g131);
		g43.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.ListDatatype(
								new com.siemens.ct.exi.core.datatype.StringDatatype(
										qnc13), qnc12)), g59);
		g44.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.StringDatatype(
								qnc13)), g59);
		g45.addProduction(
				new com.siemens.ct.exi.core.grammars.event.AttributeGeneric(),
				g45);
		g45.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElementGeneric(),
				g133);
		g45.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g45.addProduction(
				new com.siemens.ct.exi.core.grammars.event.CharactersGeneric(),
				g133);
		g46.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.NBitUnsignedIntegerDatatype(
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(-128),
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(127), qnc28)), g59);
		g47.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DecimalDatatype(
								qnc31)), g59);
		g48.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.IntegerDatatype(
								qnc41)), g59);
		g49.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
								qnc46)), g59);
		g50.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.NBitUnsignedIntegerDatatype(
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(0),
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(255), qnc54)), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g59);
		g51.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g59);
		g52.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.EnumerationDatatype(
								new com.siemens.ct.exi.core.values.Value[] {
										new com.siemens.ct.exi.core.values.StringValue(
												"Document"),
										new com.siemens.ct.exi.core.values.StringValue(
												"DocContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"DocEnd"),
										new com.siemens.ct.exi.core.values.StringValue(
												"Fragment"),
										new com.siemens.ct.exi.core.values.StringValue(
												"FragmentContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"FirstStartTagContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"StartTagContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"ElementContent") },
								new com.siemens.ct.exi.core.datatype.StringDatatype(
										qnc51), qnc107)), g59);
		g53.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc123,
						g8), g65);
		g53.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g54.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc105,
						g9), g62);
		g54.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc103,
						g9), g62);
		g54.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g63);
		g54.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g59);
		g54.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g55.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc1,
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g56);
		g56.addProduction(new com.siemens.ct.exi.core.grammars.event.Attribute(
				qnc2,
				new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
						qnc55)), g57);
		g57.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc113,
						g12), g115);
		g58.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc115,
						g12), g116);
		g58.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc114,
						g12), g117);
		g58.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g118);
		g58.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g118);
		g58.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g59.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g61.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
								qnc55)), g59);
		g62.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g63);
		g62.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g59);
		g62.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g63.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g59);
		g63.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g64.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc105,
						g9), g62);
		g64.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc103,
						g9), g62);
		g64.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g63);
		g64.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g59);
		g64.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g65.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc123,
						g8), g65);
		g65.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g66.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc119,
						g7), g66);
		g66.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g67.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc129,
						g10), g114);
		g67.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc108,
						g36), g59);
		g68.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc116,
						g12), g69);
		g68.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc88,
						g13), g69);
		g68.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc127,
						g9), g70);
		g69.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc127,
						g9), g70);
		g70.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc126,
						g9), g71);
		g71.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc71,
						g9), g59);
		g71.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g72.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc121,
						g12), g59);
		g72.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc79,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc139,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc77,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc99,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc98,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc95,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc92,
						g12), g59);
		g73.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc94,
						g12), g59);
		g74.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.IntegerDatatype(
								qnc42)), g59);
		g75.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc142,
						g19), g59);
		g76.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc117,
						g19), g75);
		g77.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc141,
						g12), g59);
		g77.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc118,
						g18), g59);
		g77.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g78.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.ListDatatype(
								new com.siemens.ct.exi.core.datatype.UnsignedIntegerDatatype(
										qnc55), qnc23)), g59);
		g79.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc125,
						g21), g59);
		g79.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g59);
		g80.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g59);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc70,
						g22), g83);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc110,
						g23), g85);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc73,
						g24), g87);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc101,
						g25), g89);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc100,
						g26), g91);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc81,
						g27), g93);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc80,
						g28), g95);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc97,
						g29), g97);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc96,
						g30), g99);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc93,
						g31), g101);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc140,
						g32), g103);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc83,
						g33), g105);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc91,
						g34), g107);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc112,
						g19), g108);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc138,
						g35), g110);
		g81.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g82.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.BinaryBase64Datatype(
								qnc26)), g59);
		g83.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc70,
						g22), g83);
		g83.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g84.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.BinaryHexDatatype(
								qnc40)), g59);
		g85.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc110,
						g23), g85);
		g85.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g86.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.BooleanDatatype(
								qnc27)), g59);
		g87.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc73,
						g24), g87);
		g87.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g88.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gYear,
								qnc38)), g59);
		g89.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc101,
						g25), g89);
		g89.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g90.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gYearMonth,
								qnc39)), g59);
		g91.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc100,
						g26), g91);
		g91.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g92.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.date,
								qnc29)), g59);
		g93.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc81,
						g27), g93);
		g93.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g94.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.dateTime,
								qnc30)), g59);
		g95.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc80,
						g28), g95);
		g95.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g96.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gMonth,
								qnc36)), g59);
		g97.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc97,
						g29), g97);
		g97.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g98.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gMonthDay,
								qnc37)), g59);
		g99.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc96,
						g30), g99);
		g99.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g100.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.gDay,
								qnc35)), g59);
		g101.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc93,
						g31), g101);
		g101.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g102.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DatetimeDatatype(
								com.siemens.ct.exi.core.types.DateTimeType.time,
								qnc52)), g59);
		g103.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc140,
						g32), g103);
		g103.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g104.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.DecimalDatatype(
								qnc31)), g59);
		g105.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc83,
						g33), g105);
		g105.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g106.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.FloatDatatype(
								qnc32)), g59);
		g107.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc91,
						g34), g107);
		g107.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g108.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc112,
						g19), g108);
		g108.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g109.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.StringDatatype(
								qnc51)), g59);
		g110.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc138,
						g35), g110);
		g110.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g111.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc89,
						g14), g81);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g68);
		g112.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g68);
		g113.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc128,
						g11), g113);
		g113.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g114.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc108,
						g36), g59);
		g115.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc106,
						g37), g115);
		g115.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g116.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc114,
						g12), g117);
		g116.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g118);
		g116.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g118);
		g116.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g117.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g118);
		g117.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g118);
		g117.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g118.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g118);
		g118.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g119.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc120,
						g9), g59);
		g119.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g120.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc66,
						g9), g121);
		g121.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc64,
						g9), g59);
		g121.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g122.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc68,
						g9), g120);
		g123.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc134,
						g9), g124);
		g124.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc133,
						g9), g59);
		g125.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc136,
						g9), g123);
		g126.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc75,
						g9), g59);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc130,
						g12), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc86,
						g12), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc63,
						g39), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc67,
						g9), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc65,
						g12), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc131,
						g40), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc135,
						g9), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc132,
						g12), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc87,
						g12), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc74,
						g41), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc76,
						g12), g119);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc120,
						g9), g59);
		g127.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g128.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc115,
						g12), g116);
		g128.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc114,
						g12), g117);
		g128.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g118);
		g128.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g118);
		g128.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g129.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc113,
						g12), g115);
		g130.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc124,
						g6), g67);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc63,
						g39), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc64,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc65,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc66,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc67,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc68,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc69,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc70,
						g22), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc71,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc72,
						g15), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc73,
						g24), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc74,
						g41), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc75,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc76,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc77,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc78,
						g16), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc79,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc80,
						g28), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc81,
						g27), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc82,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc83,
						g33), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc84,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc85,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc86,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc87,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc88,
						g13), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc89,
						g14), g131);
		g131.addProduction(globalSE90, g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc91,
						g34), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc92,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc93,
						g31), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc94,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc95,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc96,
						g30), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc97,
						g29), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc98,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc99,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc100,
						g26), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc101,
						g25), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc102,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc103,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc104,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc105,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc106,
						g37), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc108,
						g36), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc109,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc110,
						g23), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc111,
						g17), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc112,
						g19), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc113,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc114,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc115,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc116,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc117,
						g19), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc118,
						g18), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc119,
						g7), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc120,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc121,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc122,
						g38), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc123,
						g8), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc124,
						g6), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc125,
						g21), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc126,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc127,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc128,
						g11), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc129,
						g10), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc130,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc131,
						g40), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc132,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc133,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc134,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc135,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc136,
						g9), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc137,
						g20), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc138,
						g35), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc139,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc140,
						g32), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc141,
						g12), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElement(qnc142,
						g19), g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElementGeneric(),
				g131);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g131.addProduction(
				new com.siemens.ct.exi.core.grammars.event.CharactersGeneric(),
				g131);
		g132.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.ListDatatype(
								new com.siemens.ct.exi.core.datatype.StringDatatype(
										qnc13), qnc12)), g59);
		g133.addProduction(
				new com.siemens.ct.exi.core.grammars.event.StartElementGeneric(),
				g133);
		g133.addProduction(
				new com.siemens.ct.exi.core.grammars.event.EndElement(), g60);
		g133.addProduction(
				new com.siemens.ct.exi.core.grammars.event.CharactersGeneric(),
				g133);
		g134.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.NBitUnsignedIntegerDatatype(
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(-128),
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(127), qnc28)), g59);
		g135.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.NBitUnsignedIntegerDatatype(
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(0),
								com.siemens.ct.exi.core.values.IntegerValue
										.valueOf(255), qnc54)), g59);
		g136.addProduction(
				new com.siemens.ct.exi.core.grammars.event.Characters(
						new com.siemens.ct.exi.core.datatype.EnumerationDatatype(
								new com.siemens.ct.exi.core.values.Value[] {
										new com.siemens.ct.exi.core.values.StringValue(
												"Document"),
										new com.siemens.ct.exi.core.values.StringValue(
												"DocContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"DocEnd"),
										new com.siemens.ct.exi.core.values.StringValue(
												"Fragment"),
										new com.siemens.ct.exi.core.values.StringValue(
												"FragmentContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"FirstStartTagContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"StartTagContent"),
										new com.siemens.ct.exi.core.values.StringValue(
												"ElementContent") },
								new com.siemens.ct.exi.core.datatype.StringDatatype(
										qnc51), qnc107)), g59);
		/* END Grammar Events ----- */

	}

	void initFirstStartGrammars() {
		/* BEGIN FirstStartGrammar ----- */
		g5.setElementContentGrammar(g130);
		g6.setElementContentGrammar(g66);
		g7.setElementContentGrammar(g65);
		g8.setElementContentGrammar(g64);
		g9.setElementContentGrammar(g61);
		g9.setTypeCastable(true);
		g10.setElementContentGrammar(g113);
		g11.setElementContentGrammar(g112);
		g12.setElementContentGrammar(g59);
		g13.setElementContentGrammar(g111);
		g14.setElementContentGrammar(g80);
		g14.setTypeCastable(true);
		g15.setElementContentGrammar(g72);
		g16.setElementContentGrammar(g73);
		g17.setElementContentGrammar(g77);
		g18.setElementContentGrammar(g76);
		g19.setElementContentGrammar(g74);
		g19.setTypeCastable(true);
		g20.setElementContentGrammar(g79);
		g21.setElementContentGrammar(g78);
		g22.setElementContentGrammar(g82);
		g23.setElementContentGrammar(g84);
		g24.setElementContentGrammar(g86);
		g25.setElementContentGrammar(g88);
		g26.setElementContentGrammar(g90);
		g27.setElementContentGrammar(g92);
		g28.setElementContentGrammar(g94);
		g29.setElementContentGrammar(g96);
		g30.setElementContentGrammar(g98);
		g31.setElementContentGrammar(g100);
		g32.setElementContentGrammar(g102);
		g33.setElementContentGrammar(g104);
		g33.setTypeCastable(true);
		g34.setElementContentGrammar(g106);
		g35.setElementContentGrammar(g109);
		g35.setTypeCastable(true);
		g36.setElementContentGrammar(g129);
		g37.setElementContentGrammar(g128);
		g38.setElementContentGrammar(g127);
		g39.setElementContentGrammar(g122);
		g40.setElementContentGrammar(g125);
		g41.setElementContentGrammar(g126);
		g42.setElementContentGrammar(g131);
		g42.setTypeCastable(true);
		g42.setNillable(true);
		g43.setElementContentGrammar(g132);
		g44.setElementContentGrammar(g109);
		g45.setElementContentGrammar(g133);
		g46.setElementContentGrammar(g134);
		g47.setElementContentGrammar(g104);
		g48.setElementContentGrammar(g74);
		g49.setElementContentGrammar(g61);
		g50.setElementContentGrammar(g135);
		g51.setElementContentGrammar(g80);
		g52.setElementContentGrammar(g136);
		/* END FirstStartGrammar ----- */

	}

	public GrammarsForGrammars() {
		initGlobalElements();
		initGlobalAttributes();
		initTypeGrammars();
		initGrammarEvents();
		initFirstStartGrammars();
	}

	public boolean isSchemaInformed() {
		return true;
	}

	public String getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(String schemaId) throws UnsupportedOption {
		this.schemaId = schemaId;
	}

	public boolean isBuiltInXMLSchemaTypesOnly() {
		return false;
	}

	public Grammar getDocumentGrammar() {
		return g0;
	}

	public Grammar getFragmentGrammar() {
		return g3;
	}

	public GrammarContext getGrammarContext() {
		return gc;
	}

	public SchemaInformedGrammars GetSchemaInformedGrammars()
			throws UnsupportedOption {
		SchemaInformedGrammars grammars = new SchemaInformedGrammars(gc, g0,
				g3, g42);
		grammars.setSchemaId(schemaId);
		return grammars;
	}

}
