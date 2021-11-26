/*
 * generated by Xtext 2.25.0
 */
grammar InternalExtendedIML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.iml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.iml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.iml.services.ExtendedIMLGrammarAccess;

}

@parser::members {

 	private ExtendedIMLGrammarAccess grammarAccess;

    public InternalExtendedIMLParser(TokenStream input, ExtendedIMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ExtendedIMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.example.iml.ExtendedIML.AbstractElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	iv_ruleAbstractElement=ruleAbstractElement
	{ $current=$iv_ruleAbstractElement.current; }
	EOF;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getImporterParserRuleCall_0());
		}
		this_Importer_0=ruleImporter
		{
			$current = $this_Importer_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1());
		}
		this_Operator_1=ruleOperator
		{
			$current = $this_Operator_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImporter
entryRuleImporter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImporterRule()); }
	iv_ruleImporter=ruleImporter
	{ $current=$iv_ruleImporter.current; }
	EOF;

// Rule Importer
ruleImporter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImporterAccess().getImageImporterParserRuleCall_0());
		}
		this_ImageImporter_0=ruleImageImporter
		{
			$current = $this_ImageImporter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getImporterAccess().getDirImporterParserRuleCall_1());
		}
		this_DirImporter_1=ruleDirImporter
		{
			$current = $this_DirImporter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImageImporter
entryRuleImageImporter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImageImporterRule()); }
	iv_ruleImageImporter=ruleImageImporter
	{ $current=$iv_ruleImageImporter.current; }
	EOF;

// Rule ImageImporter
ruleImageImporter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImageImporterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0());
				}
				lv_importedNamespace_2_0=ruleQualifiedImageName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImageImporterRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_2_0,
						"org.xtext.example.iml.ExtendedIML.QualifiedImageName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedImageName
entryRuleQualifiedImageName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedImageNameRule()); }
	iv_ruleQualifiedImageName=ruleQualifiedImageName
	{ $current=$iv_ruleQualifiedImageName.current.getText(); }
	EOF;

// Rule QualifiedImageName
ruleQualifiedImageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getQualifiedImageNameAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleQualifiedPath
entryRuleQualifiedPath returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedPathRule()); }
	iv_ruleQualifiedPath=ruleQualifiedPath
	{ $current=$iv_ruleQualifiedPath.current.getText(); }
	EOF;

// Rule QualifiedPath
ruleQualifiedPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_0());
			}
		)?
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_1());
			}
		)?
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2());
		}
		(
			kw=':'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getColonKeyword_3());
			}
		)?
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_4_0());
			}
			this_ID_5=RULE_ID
			{
				$current.merge(this_ID_5);
			}
			{
				newLeafNode(this_ID_5, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_4_1());
			}
		)*
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_5());
			}
		)?
	)
;

// Entry rule entryRuleDirImporter
entryRuleDirImporter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirImporterRule()); }
	iv_ruleDirImporter=ruleDirImporter
	{ $current=$iv_ruleDirImporter.current; }
	EOF;

// Rule DirImporter
ruleDirImporter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='path'
		{
			newLeafNode(otherlv_0, grammarAccess.getDirImporterAccess().getPathKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0());
				}
				lv_pathDir_1_0=ruleQualifiedPath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirImporterRule());
					}
					set(
						$current,
						"pathDir",
						lv_pathDir_1_0,
						"org.xtext.example.iml.ExtendedIML.QualifiedPath");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOperator
entryRuleOperator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current; }
	EOF;

// Rule Operator
ruleOperator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getRotateOperationParserRuleCall_0());
		}
		this_RotateOperation_0=ruleRotateOperation
		{
			$current = $this_RotateOperation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getFilterOperationParserRuleCall_1());
		}
		this_FilterOperation_1=ruleFilterOperation
		{
			$current = $this_FilterOperation_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getBlurOperationParserRuleCall_2());
		}
		this_BlurOperation_2=ruleBlurOperation
		{
			$current = $this_BlurOperation_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3());
		}
		this_EqualizeOperation_3=ruleEqualizeOperation
		{
			$current = $this_EqualizeOperation_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getShowOperationParserRuleCall_4());
		}
		this_ShowOperation_4=ruleShowOperation
		{
			$current = $this_ShowOperation_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getSaveOperationParserRuleCall_5());
		}
		this_SaveOperation_5=ruleSaveOperation
		{
			$current = $this_SaveOperation_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getFillOperationParserRuleCall_6());
		}
		this_FillOperation_6=ruleFillOperation
		{
			$current = $this_FillOperation_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRotateOperation
entryRuleRotateOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateOperationRule()); }
	iv_ruleRotateOperation=ruleRotateOperation
	{ $current=$iv_ruleRotateOperation.current; }
	EOF;

// Rule RotateOperation
ruleRotateOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rotate'
		{
			newLeafNode(otherlv_0, grammarAccess.getRotateOperationAccess().getRotateKeyword_0());
		}
		(
			(
				lv_var_1_0=RULE_ID
				{
					newLeafNode(lv_var_1_0, grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateOperationAccess().getDegreeValidRotateIntParserRuleCall_2_0());
				}
				lv_degree_2_0=ruleValidRotateInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateOperationRule());
					}
					set(
						$current,
						"degree",
						lv_degree_2_0,
						"org.xtext.example.iml.ExtendedIML.ValidRotateInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValidRotateInt
entryRuleValidRotateInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidRotateIntRule()); }
	iv_ruleValidRotateInt=ruleValidRotateInt
	{ $current=$iv_ruleValidRotateInt.current.getText(); }
	EOF;

// Rule ValidRotateInt
ruleValidRotateInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT1_0=RULE_INT1
		{
			$current.merge(this_INT1_0);
		}
		{
			newLeafNode(this_INT1_0, grammarAccess.getValidRotateIntAccess().getINT1TerminalRuleCall_0());
		}
		    |
		this_INT2_1=RULE_INT2
		{
			$current.merge(this_INT2_1);
		}
		{
			newLeafNode(this_INT2_1, grammarAccess.getValidRotateIntAccess().getINT2TerminalRuleCall_1());
		}
		    |
		this_INT3_2=RULE_INT3
		{
			$current.merge(this_INT3_2);
		}
		{
			newLeafNode(this_INT3_2, grammarAccess.getValidRotateIntAccess().getINT3TerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleFilterOperation
entryRuleFilterOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterOperationRule()); }
	iv_ruleFilterOperation=ruleFilterOperation
	{ $current=$iv_ruleFilterOperation.current; }
	EOF;

// Rule FilterOperation
ruleFilterOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFilterOperationAccess().getFilterOperationAction_0(),
					$current);
			}
		)
		otherlv_1='filter'
		{
			newLeafNode(otherlv_1, grammarAccess.getFilterOperationAccess().getFilterKeyword_1());
		}
		(
			(
				lv_var_2_0=RULE_ID
				{
					newLeafNode(lv_var_2_0, grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFilterOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		otherlv_3='gray'
		{
			newLeafNode(otherlv_3, grammarAccess.getFilterOperationAccess().getGrayKeyword_3());
		}
	)
;

// Entry rule entryRuleBlurOperation
entryRuleBlurOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlurOperationRule()); }
	iv_ruleBlurOperation=ruleBlurOperation
	{ $current=$iv_ruleBlurOperation.current; }
	EOF;

// Rule BlurOperation
ruleBlurOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='blur'
		{
			newLeafNode(otherlv_0, grammarAccess.getBlurOperationAccess().getBlurKeyword_0());
		}
		(
			(
				lv_var_1_0=RULE_ID
				{
					newLeafNode(lv_var_1_0, grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBlurOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getBlurOperationAccess().getIntensityValidBlurParserRuleCall_2_0());
				}
				lv_intensity_2_0=ruleValidBlur
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlurOperationRule());
					}
					set(
						$current,
						"intensity",
						lv_intensity_2_0,
						"org.xtext.example.iml.ExtendedIML.ValidBlur");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValidBlur
entryRuleValidBlur returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidBlurRule()); }
	iv_ruleValidBlur=ruleValidBlur
	{ $current=$iv_ruleValidBlur.current.getText(); }
	EOF;

// Rule ValidBlur
ruleValidBlur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT1_0=RULE_INT1
		{
			$current.merge(this_INT1_0);
		}
		{
			newLeafNode(this_INT1_0, grammarAccess.getValidBlurAccess().getINT1TerminalRuleCall_0());
		}
		    |
		this_INT2_1=RULE_INT2
		{
			$current.merge(this_INT2_1);
		}
		{
			newLeafNode(this_INT2_1, grammarAccess.getValidBlurAccess().getINT2TerminalRuleCall_1());
		}
		    |
		kw='low'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getValidBlurAccess().getLowKeyword_2());
		}
		    |
		kw='medium'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getValidBlurAccess().getMediumKeyword_3());
		}
		    |
		kw='high'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getValidBlurAccess().getHighKeyword_4());
		}
	)
;

// Entry rule entryRuleEqualizeOperation
entryRuleEqualizeOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualizeOperationRule()); }
	iv_ruleEqualizeOperation=ruleEqualizeOperation
	{ $current=$iv_ruleEqualizeOperation.current; }
	EOF;

// Rule EqualizeOperation
ruleEqualizeOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEqualizeOperationAccess().getEqualizeOperationAction_0(),
					$current);
			}
		)
		otherlv_1='equalize'
		{
			newLeafNode(otherlv_1, grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_1());
		}
		(
			(
				lv_var_2_0=RULE_ID
				{
					newLeafNode(lv_var_2_0, grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEqualizeOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleShowOperation
entryRuleShowOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShowOperationRule()); }
	iv_ruleShowOperation=ruleShowOperation
	{ $current=$iv_ruleShowOperation.current; }
	EOF;

// Rule ShowOperation
ruleShowOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getShowOperationAccess().getShowOperationAction_0(),
					$current);
			}
		)
		otherlv_1='show'
		{
			newLeafNode(otherlv_1, grammarAccess.getShowOperationAccess().getShowKeyword_1());
		}
		(
			(
				lv_var_2_0=RULE_ID
				{
					newLeafNode(lv_var_2_0, grammarAccess.getShowOperationAccess().getVarIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getShowOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleSaveOperation
entryRuleSaveOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSaveOperationRule()); }
	iv_ruleSaveOperation=ruleSaveOperation
	{ $current=$iv_ruleSaveOperation.current; }
	EOF;

// Rule SaveOperation
ruleSaveOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSaveOperationAccess().getSaveOperationAction_0(),
					$current);
			}
		)
		otherlv_1='save'
		{
			newLeafNode(otherlv_1, grammarAccess.getSaveOperationAccess().getSaveKeyword_1());
		}
		(
			(
				lv_var_2_0=RULE_ID
				{
					newLeafNode(lv_var_2_0, grammarAccess.getSaveOperationAccess().getVarIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSaveOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleFillOperation
entryRuleFillOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFillOperationRule()); }
	iv_ruleFillOperation=ruleFillOperation
	{ $current=$iv_ruleFillOperation.current; }
	EOF;

// Rule FillOperation
ruleFillOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFillOperationAccess().getFillOperationAction_0(),
					$current);
			}
		)
		otherlv_1='fill'
		{
			newLeafNode(otherlv_1, grammarAccess.getFillOperationAccess().getFillKeyword_1());
		}
		(
			(
				lv_var_2_0=RULE_ID
				{
					newLeafNode(lv_var_2_0, grammarAccess.getFillOperationAccess().getVarIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFillOperationRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFillOperationAccess().getSizeValidINTParserRuleCall_3_0());
				}
				lv_size_3_0=ruleValidINT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFillOperationRule());
					}
					set(
						$current,
						"size",
						lv_size_3_0,
						"org.xtext.example.iml.ExtendedIML.ValidINT");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValidINT
entryRuleValidINT returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidINTRule()); }
	iv_ruleValidINT=ruleValidINT
	{ $current=$iv_ruleValidINT.current.getText(); }
	EOF;

// Rule ValidINT
ruleValidINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getValidINTAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_INT2_1=RULE_INT2
		{
			$current.merge(this_INT2_1);
		}
		{
			newLeafNode(this_INT2_1, grammarAccess.getValidINTAccess().getINT2TerminalRuleCall_1());
		}
		    |
		this_INT3_2=RULE_INT3
		{
			$current.merge(this_INT3_2);
		}
		{
			newLeafNode(this_INT3_2, grammarAccess.getValidINTAccess().getINT3TerminalRuleCall_2());
		}
	)
;

RULE_INT1 : '0'..'9';

RULE_INT2 : '0'..'9' '0'..'9';

RULE_INT3 : '0'..'9' '0'..'9' '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
