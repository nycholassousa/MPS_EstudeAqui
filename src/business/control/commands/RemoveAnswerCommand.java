package business.control.commands;

import business.model.answers.Answers;
import business.model.answers.AnswersComponent;
import business.model.answers.AnswersComposite;
import business.model.exceptions.InvalidTypeException;

public class RemoveAnswerCommand implements Command {

    private AnswersComponent component;
    private Object object;

    public RemoveAnswerCommand(AnswersComponent component, Object object) {
        this.component = component;
        this.object = object;
    }

    @Override
    public void execute() {
        if (object instanceof AnswersComponent) {
            AnswersComposite composite = (AnswersComposite) component;
            composite.deleteComponent((AnswersComponent) object);
        } else if (object instanceof Answers) {
            component.removeAnswer((Answers) object);
        } else {
            throw new InvalidTypeException("Error: Invalid Type of Object");
        }
    }

}
