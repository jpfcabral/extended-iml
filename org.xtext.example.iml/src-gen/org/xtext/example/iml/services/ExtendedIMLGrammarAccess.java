/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ExtendedIMLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//    elements+=AbstractElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}
	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImporterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperatorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractElement:
		//    Importer | Operator;
		@Override public ParserRule getRule() { return rule; }
		
		//Importer | Operator
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Importer
		public RuleCall getImporterParserRuleCall_0() { return cImporterParserRuleCall_0; }
		
		//Operator
		public RuleCall getOperatorParserRuleCall_1() { return cOperatorParserRuleCall_1; }
	}
	public class ImporterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.Importer");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImageImporterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDirImporterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Importer:
		//    ImageImporter | DirImporter;
		@Override public ParserRule getRule() { return rule; }
		
		//ImageImporter | DirImporter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ImageImporter
		public RuleCall getImageImporterParserRuleCall_0() { return cImageImporterParserRuleCall_0; }
		
		//DirImporter
		public RuleCall getDirImporterParserRuleCall_1() { return cDirImporterParserRuleCall_1; }
	}
	public class ImageImporterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.ImageImporter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportedNamespaceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportedNamespaceQualifiedImageNameParserRuleCall_2_0 = (RuleCall)cImportedNamespaceAssignment_2.eContents().get(0);
		
		//ImageImporter:
		//    name=ID "=" importedNamespace=QualifiedImageName;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID "=" importedNamespace=QualifiedImageName
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//importedNamespace=QualifiedImageName
		public Assignment getImportedNamespaceAssignment_2() { return cImportedNamespaceAssignment_2; }
		
		//QualifiedImageName
		public RuleCall getImportedNamespaceQualifiedImageNameParserRuleCall_2_0() { return cImportedNamespaceQualifiedImageNameParserRuleCall_2_0; }
	}
	public class QualifiedImageNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.QualifiedImageName");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//QualifiedImageName:
		//    ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class QualifiedPathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.QualifiedPath");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSolidusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSolidusKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Keyword cSolidusKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//QualifiedPath:
		//    ('.')? ('/')? ID (':')? ('/' ID)* ('/')?;
		@Override public ParserRule getRule() { return rule; }
		
		//('.')? ('/')? ID (':')? ('/' ID)* ('/')?
		public Group getGroup() { return cGroup; }
		
		//('.')?
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }
		
		//('/')?
		public Keyword getSolidusKeyword_1() { return cSolidusKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//(':')?
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//('/' ID)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'/'
		public Keyword getSolidusKeyword_4_0() { return cSolidusKeyword_4_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_4_1() { return cIDTerminalRuleCall_4_1; }
		
		//('/')?
		public Keyword getSolidusKeyword_5() { return cSolidusKeyword_5; }
	}
	public class DirImporterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.DirImporter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPathKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathDirAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathDirQualifiedPathParserRuleCall_1_0 = (RuleCall)cPathDirAssignment_1.eContents().get(0);
		
		//DirImporter:
		//    "path" pathDir=QualifiedPath;
		@Override public ParserRule getRule() { return rule; }
		
		//"path" pathDir=QualifiedPath
		public Group getGroup() { return cGroup; }
		
		//"path"
		public Keyword getPathKeyword_0() { return cPathKeyword_0; }
		
		//pathDir=QualifiedPath
		public Assignment getPathDirAssignment_1() { return cPathDirAssignment_1; }
		
		//QualifiedPath
		public RuleCall getPathDirQualifiedPathParserRuleCall_1_0() { return cPathDirQualifiedPathParserRuleCall_1_0; }
	}
	public class OperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.Operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRotateOperationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFilterOperationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBlurOperationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEqualizeOperationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cShowOperationParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cSaveOperationParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cFillOperationParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//Operator:
		//    RotateOperation | FilterOperation | BlurOperation | EqualizeOperation |
		//    ShowOperation | SaveOperation | FillOperation;
		@Override public ParserRule getRule() { return rule; }
		
		//RotateOperation | FilterOperation | BlurOperation | EqualizeOperation |
		//ShowOperation | SaveOperation | FillOperation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RotateOperation
		public RuleCall getRotateOperationParserRuleCall_0() { return cRotateOperationParserRuleCall_0; }
		
		//FilterOperation
		public RuleCall getFilterOperationParserRuleCall_1() { return cFilterOperationParserRuleCall_1; }
		
		//BlurOperation
		public RuleCall getBlurOperationParserRuleCall_2() { return cBlurOperationParserRuleCall_2; }
		
		//EqualizeOperation
		public RuleCall getEqualizeOperationParserRuleCall_3() { return cEqualizeOperationParserRuleCall_3; }
		
		//ShowOperation
		public RuleCall getShowOperationParserRuleCall_4() { return cShowOperationParserRuleCall_4; }
		
		//SaveOperation
		public RuleCall getSaveOperationParserRuleCall_5() { return cSaveOperationParserRuleCall_5; }
		
		//FillOperation
		public RuleCall getFillOperationParserRuleCall_6() { return cFillOperationParserRuleCall_6; }
	}
	public class RotateOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.RotateOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRotateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarIDTerminalRuleCall_1_0 = (RuleCall)cVarAssignment_1.eContents().get(0);
		private final Assignment cDegreeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDegreeValidRotateIntParserRuleCall_2_0 = (RuleCall)cDegreeAssignment_2.eContents().get(0);
		
		//RotateOperation:
		//    "rotate" (var=ID)? degree=ValidRotateInt;
		@Override public ParserRule getRule() { return rule; }
		
		//"rotate" (var=ID)? degree=ValidRotateInt
		public Group getGroup() { return cGroup; }
		
		//"rotate"
		public Keyword getRotateKeyword_0() { return cRotateKeyword_0; }
		
		//(var=ID)?
		public Assignment getVarAssignment_1() { return cVarAssignment_1; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_1_0() { return cVarIDTerminalRuleCall_1_0; }
		
		//degree=ValidRotateInt
		public Assignment getDegreeAssignment_2() { return cDegreeAssignment_2; }
		
		//ValidRotateInt
		public RuleCall getDegreeValidRotateIntParserRuleCall_2_0() { return cDegreeValidRotateIntParserRuleCall_2_0; }
	}
	public class ValidRotateIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.ValidRotateInt");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINT1TerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINT2TerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINT3TerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ValidRotateInt: INT1 | INT2 | INT3;
		@Override public ParserRule getRule() { return rule; }
		
		//INT1 | INT2 | INT3
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT1
		public RuleCall getINT1TerminalRuleCall_0() { return cINT1TerminalRuleCall_0; }
		
		//INT2
		public RuleCall getINT2TerminalRuleCall_1() { return cINT2TerminalRuleCall_1; }
		
		//INT3
		public RuleCall getINT3TerminalRuleCall_2() { return cINT3TerminalRuleCall_2; }
	}
	public class FilterOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.FilterOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFilterOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFilterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarIDTerminalRuleCall_2_0 = (RuleCall)cVarAssignment_2.eContents().get(0);
		private final Keyword cGrayKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FilterOperation:
		//    {FilterOperation} "filter" (var=ID)? "gray";
		@Override public ParserRule getRule() { return rule; }
		
		//{FilterOperation} "filter" (var=ID)? "gray"
		public Group getGroup() { return cGroup; }
		
		//{FilterOperation}
		public Action getFilterOperationAction_0() { return cFilterOperationAction_0; }
		
		//"filter"
		public Keyword getFilterKeyword_1() { return cFilterKeyword_1; }
		
		//(var=ID)?
		public Assignment getVarAssignment_2() { return cVarAssignment_2; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_2_0() { return cVarIDTerminalRuleCall_2_0; }
		
		//"gray"
		public Keyword getGrayKeyword_3() { return cGrayKeyword_3; }
	}
	public class BlurOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.BlurOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBlurKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarIDTerminalRuleCall_1_0 = (RuleCall)cVarAssignment_1.eContents().get(0);
		private final Assignment cIntensityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIntensityValidBlurParserRuleCall_2_0 = (RuleCall)cIntensityAssignment_2.eContents().get(0);
		
		//BlurOperation:
		//    "blur" (var=ID)? intensity=ValidBlur;
		@Override public ParserRule getRule() { return rule; }
		
		//"blur" (var=ID)? intensity=ValidBlur
		public Group getGroup() { return cGroup; }
		
		//"blur"
		public Keyword getBlurKeyword_0() { return cBlurKeyword_0; }
		
		//(var=ID)?
		public Assignment getVarAssignment_1() { return cVarAssignment_1; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_1_0() { return cVarIDTerminalRuleCall_1_0; }
		
		//intensity=ValidBlur
		public Assignment getIntensityAssignment_2() { return cIntensityAssignment_2; }
		
		//ValidBlur
		public RuleCall getIntensityValidBlurParserRuleCall_2_0() { return cIntensityValidBlurParserRuleCall_2_0; }
	}
	public class ValidBlurElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.ValidBlur");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINT1TerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINT2TerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Keyword cLowKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cMediumKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cHighKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//ValidBlur: INT1 | INT2 | "low" | "medium" | "high" ;
		@Override public ParserRule getRule() { return rule; }
		
		//INT1 | INT2 | "low" | "medium" | "high"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT1
		public RuleCall getINT1TerminalRuleCall_0() { return cINT1TerminalRuleCall_0; }
		
		//INT2
		public RuleCall getINT2TerminalRuleCall_1() { return cINT2TerminalRuleCall_1; }
		
		//"low"
		public Keyword getLowKeyword_2() { return cLowKeyword_2; }
		
		//"medium"
		public Keyword getMediumKeyword_3() { return cMediumKeyword_3; }
		
		//"high"
		public Keyword getHighKeyword_4() { return cHighKeyword_4; }
	}
	public class EqualizeOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.EqualizeOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEqualizeOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEqualizeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarIDTerminalRuleCall_2_0 = (RuleCall)cVarAssignment_2.eContents().get(0);
		
		//EqualizeOperation:
		//    {EqualizeOperation} "equalize" (var=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{EqualizeOperation} "equalize" (var=ID)?
		public Group getGroup() { return cGroup; }
		
		//{EqualizeOperation}
		public Action getEqualizeOperationAction_0() { return cEqualizeOperationAction_0; }
		
		//"equalize"
		public Keyword getEqualizeKeyword_1() { return cEqualizeKeyword_1; }
		
		//(var=ID)?
		public Assignment getVarAssignment_2() { return cVarAssignment_2; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_2_0() { return cVarIDTerminalRuleCall_2_0; }
	}
	public class ShowOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.ShowOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cShowOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cShowKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarIDTerminalRuleCall_2_0 = (RuleCall)cVarAssignment_2.eContents().get(0);
		
		//ShowOperation:
		//    {ShowOperation} "show" (var=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ShowOperation} "show" (var=ID)?
		public Group getGroup() { return cGroup; }
		
		//{ShowOperation}
		public Action getShowOperationAction_0() { return cShowOperationAction_0; }
		
		//"show"
		public Keyword getShowKeyword_1() { return cShowKeyword_1; }
		
		//(var=ID)?
		public Assignment getVarAssignment_2() { return cVarAssignment_2; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_2_0() { return cVarIDTerminalRuleCall_2_0; }
	}
	public class SaveOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.SaveOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSaveOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSaveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarIDTerminalRuleCall_2_0 = (RuleCall)cVarAssignment_2.eContents().get(0);
		
		//SaveOperation:
		//    {SaveOperation} "save" (var=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{SaveOperation} "save" (var=ID)?
		public Group getGroup() { return cGroup; }
		
		//{SaveOperation}
		public Action getSaveOperationAction_0() { return cSaveOperationAction_0; }
		
		//"save"
		public Keyword getSaveKeyword_1() { return cSaveKeyword_1; }
		
		//(var=ID)?
		public Assignment getVarAssignment_2() { return cVarAssignment_2; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_2_0() { return cVarIDTerminalRuleCall_2_0; }
	}
	public class FillOperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.FillOperation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFillOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFillKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVarIDTerminalRuleCall_2_0 = (RuleCall)cVarAssignment_2.eContents().get(0);
		private final Assignment cSizeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSizeValidINTParserRuleCall_3_0 = (RuleCall)cSizeAssignment_3.eContents().get(0);
		
		//FillOperation:
		//    {FillOperation} "fill" (var=ID)? size=ValidINT;
		@Override public ParserRule getRule() { return rule; }
		
		//{FillOperation} "fill" (var=ID)? size=ValidINT
		public Group getGroup() { return cGroup; }
		
		//{FillOperation}
		public Action getFillOperationAction_0() { return cFillOperationAction_0; }
		
		//"fill"
		public Keyword getFillKeyword_1() { return cFillKeyword_1; }
		
		//(var=ID)?
		public Assignment getVarAssignment_2() { return cVarAssignment_2; }
		
		//ID
		public RuleCall getVarIDTerminalRuleCall_2_0() { return cVarIDTerminalRuleCall_2_0; }
		
		//size=ValidINT
		public Assignment getSizeAssignment_3() { return cSizeAssignment_3; }
		
		//ValidINT
		public RuleCall getSizeValidINTParserRuleCall_3_0() { return cSizeValidINTParserRuleCall_3_0; }
	}
	public class ValidINTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.ValidINT");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINT2TerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINT3TerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ValidINT: INT | INT2 | INT3;
		@Override public ParserRule getRule() { return rule; }
		
		//INT | INT2 | INT3
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//INT2
		public RuleCall getINT2TerminalRuleCall_1() { return cINT2TerminalRuleCall_1; }
		
		//INT3
		public RuleCall getINT3TerminalRuleCall_2() { return cINT3TerminalRuleCall_2; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tINT1;
	private final TerminalRule tINT2;
	private final TerminalRule tINT3;
	private final AbstractElementElements pAbstractElement;
	private final ImporterElements pImporter;
	private final ImageImporterElements pImageImporter;
	private final QualifiedImageNameElements pQualifiedImageName;
	private final QualifiedPathElements pQualifiedPath;
	private final DirImporterElements pDirImporter;
	private final OperatorElements pOperator;
	private final RotateOperationElements pRotateOperation;
	private final ValidRotateIntElements pValidRotateInt;
	private final FilterOperationElements pFilterOperation;
	private final BlurOperationElements pBlurOperation;
	private final ValidBlurElements pValidBlur;
	private final EqualizeOperationElements pEqualizeOperation;
	private final ShowOperationElements pShowOperation;
	private final SaveOperationElements pSaveOperation;
	private final FillOperationElements pFillOperation;
	private final ValidINTElements pValidINT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ExtendedIMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.tINT1 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.INT1");
		this.tINT2 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.INT2");
		this.tINT3 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.iml.ExtendedIML.INT3");
		this.pAbstractElement = new AbstractElementElements();
		this.pImporter = new ImporterElements();
		this.pImageImporter = new ImageImporterElements();
		this.pQualifiedImageName = new QualifiedImageNameElements();
		this.pQualifiedPath = new QualifiedPathElements();
		this.pDirImporter = new DirImporterElements();
		this.pOperator = new OperatorElements();
		this.pRotateOperation = new RotateOperationElements();
		this.pValidRotateInt = new ValidRotateIntElements();
		this.pFilterOperation = new FilterOperationElements();
		this.pBlurOperation = new BlurOperationElements();
		this.pValidBlur = new ValidBlurElements();
		this.pEqualizeOperation = new EqualizeOperationElements();
		this.pShowOperation = new ShowOperationElements();
		this.pSaveOperation = new SaveOperationElements();
		this.pFillOperation = new FillOperationElements();
		this.pValidINT = new ValidINTElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.iml.ExtendedIML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    elements+=AbstractElement*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//terminal INT1: ('0'..'9');
	public TerminalRule getINT1Rule() {
		return tINT1;
	}
	
	//terminal INT2: ('0'..'9')('0'..'9');
	public TerminalRule getINT2Rule() {
		return tINT2;
	}
	
	//terminal INT3: ('0'..'9')('0'..'9')('0'..'9');
	public TerminalRule getINT3Rule() {
		return tINT3;
	}
	
	//AbstractElement:
	//    Importer | Operator;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}
	
	//Importer:
	//    ImageImporter | DirImporter;
	public ImporterElements getImporterAccess() {
		return pImporter;
	}
	
	public ParserRule getImporterRule() {
		return getImporterAccess().getRule();
	}
	
	//ImageImporter:
	//    name=ID "=" importedNamespace=QualifiedImageName;
	public ImageImporterElements getImageImporterAccess() {
		return pImageImporter;
	}
	
	public ParserRule getImageImporterRule() {
		return getImageImporterAccess().getRule();
	}
	
	//QualifiedImageName:
	//    ID;
	public QualifiedImageNameElements getQualifiedImageNameAccess() {
		return pQualifiedImageName;
	}
	
	public ParserRule getQualifiedImageNameRule() {
		return getQualifiedImageNameAccess().getRule();
	}
	
	//QualifiedPath:
	//    ('.')? ('/')? ID (':')? ('/' ID)* ('/')?;
	public QualifiedPathElements getQualifiedPathAccess() {
		return pQualifiedPath;
	}
	
	public ParserRule getQualifiedPathRule() {
		return getQualifiedPathAccess().getRule();
	}
	
	//DirImporter:
	//    "path" pathDir=QualifiedPath;
	public DirImporterElements getDirImporterAccess() {
		return pDirImporter;
	}
	
	public ParserRule getDirImporterRule() {
		return getDirImporterAccess().getRule();
	}
	
	//Operator:
	//    RotateOperation | FilterOperation | BlurOperation | EqualizeOperation |
	//    ShowOperation | SaveOperation | FillOperation;
	public OperatorElements getOperatorAccess() {
		return pOperator;
	}
	
	public ParserRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}
	
	//RotateOperation:
	//    "rotate" (var=ID)? degree=ValidRotateInt;
	public RotateOperationElements getRotateOperationAccess() {
		return pRotateOperation;
	}
	
	public ParserRule getRotateOperationRule() {
		return getRotateOperationAccess().getRule();
	}
	
	//ValidRotateInt: INT1 | INT2 | INT3;
	public ValidRotateIntElements getValidRotateIntAccess() {
		return pValidRotateInt;
	}
	
	public ParserRule getValidRotateIntRule() {
		return getValidRotateIntAccess().getRule();
	}
	
	//FilterOperation:
	//    {FilterOperation} "filter" (var=ID)? "gray";
	public FilterOperationElements getFilterOperationAccess() {
		return pFilterOperation;
	}
	
	public ParserRule getFilterOperationRule() {
		return getFilterOperationAccess().getRule();
	}
	
	//BlurOperation:
	//    "blur" (var=ID)? intensity=ValidBlur;
	public BlurOperationElements getBlurOperationAccess() {
		return pBlurOperation;
	}
	
	public ParserRule getBlurOperationRule() {
		return getBlurOperationAccess().getRule();
	}
	
	//ValidBlur: INT1 | INT2 | "low" | "medium" | "high" ;
	public ValidBlurElements getValidBlurAccess() {
		return pValidBlur;
	}
	
	public ParserRule getValidBlurRule() {
		return getValidBlurAccess().getRule();
	}
	
	//EqualizeOperation:
	//    {EqualizeOperation} "equalize" (var=ID)?;
	public EqualizeOperationElements getEqualizeOperationAccess() {
		return pEqualizeOperation;
	}
	
	public ParserRule getEqualizeOperationRule() {
		return getEqualizeOperationAccess().getRule();
	}
	
	//ShowOperation:
	//    {ShowOperation} "show" (var=ID)?;
	public ShowOperationElements getShowOperationAccess() {
		return pShowOperation;
	}
	
	public ParserRule getShowOperationRule() {
		return getShowOperationAccess().getRule();
	}
	
	//SaveOperation:
	//    {SaveOperation} "save" (var=ID)?;
	public SaveOperationElements getSaveOperationAccess() {
		return pSaveOperation;
	}
	
	public ParserRule getSaveOperationRule() {
		return getSaveOperationAccess().getRule();
	}
	
	//FillOperation:
	//    {FillOperation} "fill" (var=ID)? size=ValidINT;
	public FillOperationElements getFillOperationAccess() {
		return pFillOperation;
	}
	
	public ParserRule getFillOperationRule() {
		return getFillOperationAccess().getRule();
	}
	
	//ValidINT: INT | INT2 | INT3;
	public ValidINTElements getValidINTAccess() {
		return pValidINT;
	}
	
	public ParserRule getValidINTRule() {
		return getValidINTAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
