import org.scalatest.FunSuite


class CubeTest extends FunSuite {

  test("CubeCal.cube")
  {
    assert(CubeCal.cube(4)===64)
    assert(CubeCal.cube(3)=== 27)
  }

  test("Square Test")
  {
    assert(CubeCal.square(3) == 9)
  }
}
