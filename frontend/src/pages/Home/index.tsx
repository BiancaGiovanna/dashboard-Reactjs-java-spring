import { Link } from "react-router-dom";

export default function Home() {
  return (
    <div>
      <Link to='/dashboard'>
        <h1>Home</h1>
      </Link>
    </div>
  );
}
