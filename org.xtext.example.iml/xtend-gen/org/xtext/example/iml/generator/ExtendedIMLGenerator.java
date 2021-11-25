/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.iml.extendedIML.BlurOperation;
import org.xtext.example.iml.extendedIML.DirImporter;
import org.xtext.example.iml.extendedIML.EqualizeOperation;
import org.xtext.example.iml.extendedIML.FilterOperation;
import org.xtext.example.iml.extendedIML.Operator;
import org.xtext.example.iml.extendedIML.RotateOperation;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ExtendedIMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CharSequence _header = this.header();
    final Function1<DirImporter, String> _function = (DirImporter it) -> {
      return it.getPathDir();
    };
    String _loadImage = this.loadImage(
      IteratorExtensions.<String>last(IteratorExtensions.<DirImporter, String>map(Iterators.<DirImporter>filter(resource.getAllContents(), DirImporter.class), _function)).toString());
    String _plus = (_header + _loadImage);
    String _applyOperators = this.applyOperators(
      Iterators.<Operator>filter(resource.getAllContents(), Operator.class));
    String _plus_1 = (_plus + _applyOperators);
    String _plus_2 = (_plus_1 + "# DEBUG \n\n");
    String _join = IteratorExtensions.join(resource.getAllContents(), "\n");
    String _plus_3 = (_plus_2 + _join);
    fsa.generateFile(
      "scripts.py", _plus_3);
  }
  
  private CharSequence header() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import numpy as np");
    _builder.newLine();
    _builder.append("import cv2");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def rotate_image(image, angle):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("image_center = tuple(np.array(image.shape[1::-1]) / 2)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rot_mat = cv2.getRotationMatrix2D(image_center, angle, 1.0)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("result = cv2.warpAffine(image, rot_mat, image.shape[1::-1], flags=cv2.INTER_LINEAR)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return result");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def convert_to_gray(image, luma=False):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def blur_image(image, intensity): ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("size = int(60 * intensity) if intensity >= 0.05 else 3");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ksize = (size, size)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("image_t = cv2.blur(image.copy(), ksize, cv2.BORDER_DEFAULT) ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return image_t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def equalize_hist(image): ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (len(image.shape)==3):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("img_to_yuv = cv2.cvtColor(image,cv2.COLOR_BGR2YUV)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("img_to_yuv[:,:,0] = cv2.equalizeHist(img_to_yuv[:,:,0])");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("hist_equalization_result = cv2.cvtColor(img_to_yuv, cv2.COLOR_YUV2BGR)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return hist_equalization_result");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("elif (len(image.shape)==2):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("img_eq = cv2.equalizeHist(image)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return img_eq");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def fill_image(img, size=(_size,_size)):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("h, w = img.shape[:2]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("c = img.shape[2] if len(img.shape)>2 else 1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if h == w: ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return cv2.resize(img, size, cv2.INTER_AREA)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("dif = h if h > w else w");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("interpolation = cv2.INTER_AREA if dif > (size[0]+size[1])//2 else cv2.INTER_CUBIC");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("x_pos = (dif - w)//2");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("y_pos = (dif - h)//2");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if len(img.shape) == 2:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mask = np.zeros((dif, dif), dtype=img.dtype)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mask[y_pos:y_pos+h, x_pos:x_pos+w] = img[:h, :w]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mask = np.zeros((dif, dif, c), dtype=img.dtype)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mask[y_pos:y_pos+h, x_pos:x_pos+w, :] = img[:h, :w, :]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return cv2.resize(mask, size, interpolation)");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private String loadImage(final CharSequence path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("img = cv2.imread(\'");
    _builder.append(path);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String applyOperators(final Iterator<Operator> op) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Operator> _iterable = IteratorExtensions.<Operator>toIterable(op);
      for(final Operator o : _iterable) {
        {
          if ((o instanceof RotateOperation)) {
            _builder.append("img = rotate_image(img, ");
            int _degree = ((RotateOperation)o).getDegree();
            _builder.append(_degree);
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            if ((o instanceof FilterOperation)) {
              _builder.append("img = convert_to_gray(img)");
              _builder.newLine();
            } else {
              if ((o instanceof BlurOperation)) {
                _builder.append("img = blur_image(img, ");
                Integer _valueOf = Integer.valueOf(((BlurOperation)o).getIntensity());
                double _divide = ((_valueOf).intValue() / 100.0);
                _builder.append(_divide);
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              } else {
                if ((o instanceof EqualizeOperation)) {
                  _builder.append("img = equalize_hist(img)");
                  _builder.newLine();
                } else {
                  _builder.append("# OPERADOR N�O ENCONTRADO");
                  _builder.newLine();
                }
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    return _builder.toString();
  }
}
