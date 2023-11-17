package Practice22;
public class ChairFactory implements ComplexAbstractFactory{
    @Override
    public CoctailChair createCoctailChair() {
        return new CoctailChair();
    }
    @Override
    public DoubleChair createDoubleChair() {
        return new DoubleChair();
    }
    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }
}
